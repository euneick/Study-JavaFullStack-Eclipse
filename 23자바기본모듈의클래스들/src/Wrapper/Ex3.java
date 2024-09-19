
/**
 * Wrapper 클래스 예제
 */
package Wrapper;

public class Ex3 {

	public static void main(String[] args) {

//		Integer boxedInt = new Integer(10);			// 자바 9버전 이후로는 사용되지 않음
		Integer boxedInt = Integer.valueOf(10);		// 해당 방법을 권장
		
//		Double boxedDouble = new Double(3.14);
		Double boxedDouble = Double.valueOf(3.14);

		int unboxedInt = boxedInt.intValue();
		System.out.println(String.valueOf(unboxedInt));
		double unboxedDouble = boxedDouble.doubleValue();
		System.out.println(String.valueOf(unboxedDouble));
	}

}
