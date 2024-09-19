
/**
 * Wrapper 클래스 자동 박싱, 자동 언박싱 예제 (JDK 5 이상)
 */
package Wrapper;

public class Ex5 {

	public static void main(String[] args) {

		Integer it = 10; 		// 자동 박싱
		System.out.println(String.valueOf(it));

		int i = it; 			// 자동 언박싱
		System.out.println(i);

		Double du = 3.14; 		// 자동 박싱
		System.out.println(String.valueOf(du));

		double d = du; 			// 자동 언박싱
		System.out.println(d);
	}

}
