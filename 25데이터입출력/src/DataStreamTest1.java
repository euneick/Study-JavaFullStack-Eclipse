import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * DataOutputStream 클래스 예제
 */
public class DataStreamTest1 {

	public static void main(String[] args) {
		
		String path = "C:\\ProjectPlace\\JavaFullStack\\a\\";
		
		char c = 'a';
		byte b = 10;
		short s = 20;
		int i = 100;
		float f = 3.14f;
		double d = 1.5;
		String str = "hello";
		
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(path + "data.txt"));
			
			dos.writeChar(c);
			dos.writeByte(b);
			dos.writeShort(s);
			dos.writeInt(i);
			dos.writeFloat(f);
			dos.writeDouble(d);
			dos.writeUTF(str);
			
			dos.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
