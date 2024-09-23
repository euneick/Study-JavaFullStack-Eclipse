import java.io.FileInputStream;

/**
 * FileInputStream 클래스 예제
 */
public class IOTest03 {

	public static void main(String[] args) {

		int data = 0;

//		String path = "C:\\ProjectPlace\\JavaFullStack\\a\\test.txt";
		String path = "C:/ProjectPlace/JavaFullStack/a/test.txt";

		try {
			FileInputStream fis = new FileInputStream(path);

			while ((data = fis.read()) != -1) {
				System.out.print((char) data);
			}

			fis.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
