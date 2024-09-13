
/**
 * String 클래스 생성 예제
 */
package StringTest;

public class Ex1 {

	public static void main(String[] args) {

		String s1 = "JAVA";
		
		String s2 = new String("programming");
		
		char[] charArr = { 'S', 't', 'r', 'i', 'n', 'g' };
		String s3 = new String(charArr);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
