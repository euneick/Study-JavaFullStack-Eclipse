import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

class ReceiveDataThread implements Runnable {

	private Socket clientSocket;
	
	private ObjectInputStream receiveStream;
	private String receiveData;
	
	public ReceiveDataThread(Socket clientSocket, ObjectInputStream receiveStream) {
		
		this.clientSocket = clientSocket;
		this.receiveStream = receiveStream;
	}
	
	@Override
	public void run() {

		try {
			while ((receiveData = receiveStream.readObject().toString()) != null) {
				
				System.out.println(receiveData);		// 수신 받은 데이터 화면에 출력
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				receiveStream.close();
				clientSocket.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ChatClientEx {

	final static int port = 6000;
	private String ipAddress;

	private Socket clientSocket = null;
	private ObjectOutputStream sendStream = null;
	private ObjectInputStream receiveStream = null;
	
	private String sendData;
	private String receiveData;

	private BufferedReader keyboardRead = null;
	
	private String userId;
	
	private ReceiveDataThread receiveDataThread;
	
	private boolean endFlag = false;		// 클라이언트 종료 여부
	
	public ChatClientEx(String userId, String ipAddress) {
		
		this.userId = userId;
		this.ipAddress = ipAddress;
		
		try {
			System.out.println(" ***** 클라이언트 ***** ");
			
			clientSocket = new Socket(ipAddress, port);		// 생성자로 Socket을 만드는 순간 서버프로그램의 accept() 메소드 호출

			keyboardRead = new BufferedReader(new InputStreamReader(System.in));

			// 생성 시 서버가 sendStream을 먼저 초기화 하고 있으므로 클라이언트에선 receiveStream을 먼저 초기화 해야 함
			receiveStream = new ObjectInputStream(clientSocket.getInputStream());	// 서버로부터 데이터 수신
			sendStream = new ObjectOutputStream(clientSocket.getOutputStream());	// 서버에 데이터 송신
			
			sendStream.writeObject(userId);		// 서버에 userId 전송
			sendStream.flush();

			// 서버로 부터 데이터를 수신받기 위한 스레드 생성
			receiveDataThread = new ReceiveDataThread(clientSocket, receiveStream);
			Thread thread = new Thread(receiveDataThread);
			
			thread.start();
			
			while (true) {
				
				sendData = keyboardRead.readLine();
				
				sendStream.writeObject(sendData);
				sendStream.flush();
				
				if (sendData.equals("/quit")) {
					endFlag = true;
					break;
				}
			}
			
			System.out.println("접속을 종료합니다.");
		}
		catch (Exception e) {
			// 접속 중 예외 발생 시
			if (!endFlag) {
				e.printStackTrace();
			}
		}
		finally {
			try {
				receiveStream.close();
				sendStream.close();
				clientSocket.close();
				System.exit(0);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	// prompt -> java ChatClientEx userId serverIP
	public static void main(String[] args) {

		if (args.length < 2) {
			System.out.println("입력 매개변수가 부족합니다.");
			System.exit(0);
		}
		
		new ChatClientEx(args[0], args[1]);
	}

}
