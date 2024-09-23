import java.io.InputStream;
import java.io.OutputStream;

/**
 * InputStream OutputStream 예제
 */
public class IOTest02 {

	public static void main(String[] args) {

		int data = 0;
		int count = 0;

		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		
		System.out.print("문자열을 입력하세요. 끝내려면 x 또는 X 또는 ctrl + z를 누르세요 : ");
		
		try {
			
			while ((data = inputStream.read()) != -1) {
				
				if (data == 'x' || data == 'X')
					break;
				
				count++;
				
				outputStream.write(data);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("count : " + count);
	}

}
