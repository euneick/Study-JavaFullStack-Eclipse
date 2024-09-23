import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * FileOutputStream 클래스 예제
 */
public class IOTest04 {

	public static void main(String[] args) {

		File file = null;
		FileOutputStream fos = null;
		InputStream inputStream = null;
		
		int data;
		String path = "C:\\ProjectPlace\\JavaFullStack\\a\\test2.txt";
		
		try {
			file = new File(path);
//			fos = new FileOutputStream(file);
			fos = new FileOutputStream(file, true);		// true : 기존의 내용 뒤에 추가	false : 기존내용 삭제하고 덮어쓰기
			inputStream = System.in;

			while ((data = inputStream.read()) != -1) {
				fos.write(data);
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();			
		}
		finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
