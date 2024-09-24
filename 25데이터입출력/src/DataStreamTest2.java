import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * DataInputStream 클래스 예제
 */
public class DataStreamTest2 {

	public static void main(String[] args) {

		String path = "C:\\ProjectPlace\\JavaFullStack\\a\\";

		char c;
		byte b;
		short s;
		int i;
		float f;
		double d;
		String str;

		try {
			DataInputStream dis = new DataInputStream(new FileInputStream(path + "data.txt"));
			
			c = dis.readChar();
			System.out.println(c);
			b = dis.readByte();
			System.out.println(b);
			s = dis.readShort();
			System.out.println(s);
			i = dis.readInt();
			System.out.println(i);
			f = dis.readFloat();
			System.out.println(f);
			d = dis.readDouble();
			System.out.println(d);
			str = dis.readUTF();
			System.out.println(str);
			
			dis.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
