import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * InputStreamReader 클래스 예제 - 한 줄 단위 입력
 */
public class ReaderWriteTest02 {

	public static void main(String[] args) throws Exception {

		String fileName = null;

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("피을 이름 입력 : ");
		fileName = bufferedReader.readLine();
		
		System.out.println("\n입력한 파일 명 : " + fileName);

		bufferedReader.close();
	}

}
