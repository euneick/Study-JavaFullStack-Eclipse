import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * File Reader/Writer 객체를 활용한 파일 복사 프로그램 예제
 */
public class FileCopy02 {

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
		
		FileReader fileReader = null;
		FileWriter fileWriter = null;
		
		try {
			fileReader = new FileReader(path + originFileName);
			fileWriter = new FileWriter(path + copiedFileName);

			while ((data = fileReader.read()) != -1) {
				fileWriter.write(data);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fileReader.close();
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
