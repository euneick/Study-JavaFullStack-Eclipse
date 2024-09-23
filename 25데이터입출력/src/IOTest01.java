import java.io.IOException;
import java.io.InputStream;

/**
 * InputStream 예제
 * 
 * read()								1 Byte 를 읽음
 * read(byte b[])						Byte 배열을 읽음
 * read(byte b[], int off, int len)		Byte 배열의 off 위치에서 len 만큼 읽음
 * 
 * 더 이상 읽을 데이터가 없으면 -1을 리턴
 */
public class IOTest01 {

	public static void main(String[] args) {

		int data = 0;
		
		System.out.print("하나의 문자를 입력하세요. 끝내려면 ctrl + z 를 누르세요 : ");

		try {
			InputStream inputStream = System.in; 	// 키보드로 입력한 데이터를 1 Byte 씩 읽을 스트림 객체

			do {
				data = inputStream.read();
				System.out.print((char) data);
			} while (data != -1);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
