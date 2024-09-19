
/**
 * Wrapper 클래스 예제
 */
package Wrapper;

public class Ex2 {

	public static void main(String[] args) {

		// 박싱
		Integer boxing1 = new Integer(10);
		Integer boxing2 = new Integer("20");

		// 언박싱
		int unboxing1 = boxing1.intValue();
		int unboxing2 = boxing2.intValue();

		int sum = unboxing1 + unboxing2;
		System.out.println("sum : " + sum);
		
		System.out.println("sum의 2진수 값 : " + Integer.toBinaryString(sum));
		System.out.println("sum의 8진수 값 : " + Integer.toOctalString(sum));
		System.out.println("sum의 16진수 값 : " + Integer.toHexString(sum));
		
		Integer intVal = new Integer(30);
		double doubleVal = intVal.doubleValue();
		System.out.println(doubleVal);
		
		int parsedVal = Integer.parseInt("100");
		System.out.println(parsedVal);
		System.out.println(parsedVal + 200);
	}

}
