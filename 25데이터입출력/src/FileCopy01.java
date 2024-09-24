import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

/**
 * Buffered Input/Output Stream 객체를 활용하여 파일 복사 프로그램 예제
 */
public class FileCopy01 {

	final static int BUFFER_SIZE = 256;

	public static void main(String[] args) {

		String path = "C:\\ProjectPlace\\JavaFullStack\\a\\";
		String originFileName;
		String copiedFileName;

		Scanner scanner = new Scanner(System.in);

		System.out.print("복사할 파일 이름 : ");
		originFileName = scanner.next();
		System.out.print("복사 생성 할 파일 이름 : ");
		copiedFileName = scanner.next();

		scanner.close();
		
		int data = 0;
		int length = 0;
		
		byte[] buffer = new byte[BUFFER_SIZE];
		
		try {
			FileInputStream fis = new FileInputStream(new File(path + originFileName));
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(path + copiedFileName)));

			while ((data = bis.read(buffer)) != -1) {		// buffer 크기 만큼 읽어 들임
				//bos.write(buffer);		// 실행결과 오류 있음. 아래의 문법대로 해야 정확히 작동
				bos.write(buffer, 0, data);
				
				length += data;
				System.out.printf("process : read[%d, %d], avail[%d]\n", data, length, bis.available());
			}
			
			bos.flush();		// 사용 후 버퍼 공간 비우기
			
			bis.close();
			fis.close();
			bos.close();			

			System.out.println(length + " Bytes are copied.");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
