import java.io.InputStreamReader;
import java.io.Reader;

/**
 * InputStreamReader 클래스 예제
 */
public class ReaderWriteTest01 {

	public static void main(String[] args) {

		int data = -1;
		
		Reader inputReader = new InputStreamReader(System.in);
		
		try {
			while (true) {
				data = inputReader.read();
				
				if (data == -1) break;

				System.out.print((char) data);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
