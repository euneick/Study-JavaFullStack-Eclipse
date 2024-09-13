
/**
 * StringBuffer 클래스 예제
 * StringBuilder 클래스 예제
 */
package String;

public class Ex3 {

	public static void main(String[] args) {
		
		StringBuffer stringBuffer = new StringBuffer("JAVA");

		System.out.println(stringBuffer);
		
		stringBuffer.append(" programming");
		
		System.out.println(stringBuffer);
		
		System.out.println("===========================================");
		
		String data = new StringBuilder()
				.append("DEF")
				.insert(0, "ABC")
				.delete(3, 4)
				.toString();
		
		System.out.println(data);
	}

}
