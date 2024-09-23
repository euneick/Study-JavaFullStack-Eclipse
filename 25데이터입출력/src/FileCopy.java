import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

/**
 * File Input/Output Stream 객체를 활용하여 파일 복사 프로그램 예제
 */
public class FileCopy {

	public static void main(String[] args) throws Exception {
		
		String path = "C:\\ProjectPlace\\JavaFullStack\\a\\";
		String originFileName;
		String copiedFileName;
		
		int data = 0;
		int size = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("복사할 파일 이름 : ");
		originFileName = scanner.next();
		System.out.print("복사 생성 할 파일 이름 : ");
		copiedFileName = scanner.next();
		
		scanner.close();
		
		File file = null;
		FileInputStream fis = new FileInputStream(path + originFileName);
		FileOutputStream fos = new FileOutputStream(path + copiedFileName);
		
		while((data = fis.read()) != -1) {
			fos.write(data);
			
			size++;
		}
		System.out.println(size + " Bytes가 복사되었습니다.");
		
		fis.close();
		fos.close();
	}

}
