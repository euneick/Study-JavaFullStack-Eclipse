
/**
 * String 클래스에서 제공하는 여러 메소드들 예제
 */
package StringTest;

public class Ex2 {

	public static void main(String[] args) {
		
		String originStr = "Java programming";

		System.out.println(originStr.length());
		
		System.out.println(originStr.charAt(9));
		
		System.out.println(originStr.equals("Java programming"));
		System.out.println(originStr.equals("Java"));
		
		String str = new String("Java programming");
		System.out.println(originStr == str);
		System.out.println(originStr.equals(str));
		
		System.out.println(originStr.substring(5));
		System.out.println(originStr.substring(5, 9));
		
		System.out.println("     Java programming     ".trim());
		
		System.out.println(originStr.concat(" Study"));
		
		System.out.println(originStr.contains("program"));
		
		System.out.println(originStr.replace('a', 'o'));
		System.out.println(originStr.replace("Java", "Python"));
		
		System.out.println(originStr.toLowerCase());
		System.out.println(originStr.toUpperCase());
		
		System.out.println(String.valueOf(10));		// 정수 10을 문자열 10으로 변환하여 리턴 
		
		System.out.println(originStr.lastIndexOf("pro"));
		System.out.println(originStr.lastIndexOf('z'));
		
		
	}

}
