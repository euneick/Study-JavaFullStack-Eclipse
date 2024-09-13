
/**
 * String 클래스 생성 예제
 * String 객체 주소 비교
 */
package String;

public class Ex1 {

	public static void main(String[] args) {

		String s1 = "JAVA";

		String s2 = new String("programming");

		char[] charArr = { 'S', 't', 'r', 'i', 'n', 'g' };
		String s3 = new String(charArr);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		String literalStr1 = "JSP";
		String literalStr2 = "JSP";

		if (literalStr1 == literalStr2) {
			System.out.println("주소가 같음");
		} 
		else {
			System.out.println("주소가 다름");
		}

		String instanceStr1 = new String("Java");
		String instanceStr2 = new String("Java");

		if (instanceStr1 == instanceStr2) {
			System.out.println("주소가 같음");
		} 
		else {
			System.out.println("주소가 다름");
		}
	}

}
