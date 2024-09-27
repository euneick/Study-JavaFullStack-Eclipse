import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

class ChatServerThread implements Runnable {
	
	private Socket socket;		// 클라이언트와 통신하기 위한 소켓
	
	private ObjectInputStream receiveStream;		// 클라이언트로부터 데이터를 수신받기 위한 스트림
	private ObjectOutputStream sendStream;			// 클라이언트에 데이터를 송신하기 위한 스트림
	
	private String userId;
	
	private HashMap<String, ObjectOutputStream> hm;		// 채팅 스레드들 간의 정보를 공유
	
	public ChatServerThread(Socket socket, HashMap<String, ObjectOutputStream> hm) {
	
		this.socket = socket;
		this.hm = hm;
		
		try {
			System.out.println(socket.getInetAddress() + " 연결 요청");

			sendStream = new ObjectOutputStream(socket.getOutputStream());
			receiveStream = new ObjectInputStream(socket.getInputStream());
			
			userId = (String) receiveStream.readObject();
			
			System.out.println("[server] " + userId + "님이 접속했습니다.");
			broadcast(userId + "님이 접속했습니다.");
			
			// 여러 스레드가 공유하는 해쉬맵을 동기화
			synchronized (hm) {
				hm.put(userId, sendStream);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 클라이언트로부터 받은 데이터를 모든 클라이언트에게 송신
	@Override
	public void run() {
		
		String receiveData;
		
		try {
			while (true) {
				
				receiveData = (String) receiveStream.readObject();		// 입력스트림을 통해 데이터 수신

				if (receiveData.equals("/quit")) {
					break;
				}
				else if (receiveData.indexOf("/to") > -1) {
					sendMsg(receiveData);
				}
				else {
					broadcast(userId + " : " + receiveData);
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("데이터 수신 실패");
		}
		finally {
			// 프로그램 종료 시
			synchronized (hm) {			// 공유자원을 동기화 블럭을 활용해 Critical Section 처리
				hm.remove(userId);
			}
			
			broadcast(userId + "님이 나갔습니다.");
			System.out.println("[server]" + userId + "님이 나갔습니다.");
			
			// 소켓 해제
			try {
				if (socket != null) { socket.close(); }
			}
			catch (Exception e) {
				e.printStackTrace();
				System.out.println("소켓 해제 실패");
			}
		}
	}
	
	// 접속 되어있는 클라이언트들에게 일괄적으로 메세지를 전달하는 메소드
	public void broadcast(String message) {
		
		// Dead Lock 을 방지하기 위한 Critical Section 처리
		synchronized (hm) {
			try {
				for (ObjectOutputStream oos : hm.values()) {
					oos.writeObject(message);
					oos.flush();
				}
			}
			catch (Exception e) {
				e.printStackTrace();
				System.out.println("메세지 전송 실패");
			}
		}
	}
	
	public void sendMsg(String message) {
		
		int begin = message.indexOf("") + 1;
		int end = message.indexOf("", begin);

		if (end != -1) {
			String id = message.substring(begin, end);
			String msg = message.substring(end + 1);

			ObjectOutputStream oos = hm.get(id);

			try {
				if (oos != null) {
					oos.writeObject(id + "님의 귓속말 : " + msg);
					oos.flush();
				}
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("귓속말 송신 실패");
			}
		}
	}
}

public class ChatServerEx {

	final static int port = 6000;

	ServerSocket serverSocket;
	Socket childSocket;

	// 채팅 스레드들 간의 정보를 공유
	HashMap<String, ObjectOutputStream> hm;

	public ChatServerEx() {

		try {
			serverSocket = new ServerSocket(port);
		}
		catch (IOException e) {
			e.printStackTrace();
			System.exit(0); // 서버 소켓 생성 실패 시 강제 종료
		}

		System.out.println(" ***** 채팅 서버 ***** ");
		System.out.println(">> 클라이언트 접속 요청을 기다리는 중");

		hm = new HashMap<String, ObjectOutputStream>();
		
		while (true) {
			
			try {
				childSocket = serverSocket.accept(); // 클라이언트 접속 요청 시 승인 (new Socket()을 리턴)

				// 데이터를 주고 받기 위한 스레드 생성
				ChatServerThread childThread = new ChatServerThread(childSocket, hm);
				Thread thread = new Thread(childThread);
				
				thread.start();
			}
			catch (IOException e) {
				e.printStackTrace();
				System.exit(0); // 클라이언트 접속 승신 실패 시 강제 종료
			}
		}
	}

	public static void main(String[] args) {
		
		new ChatServerEx();
	}

}
