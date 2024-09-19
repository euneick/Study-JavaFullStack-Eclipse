
/**
 * Wrapper 클래스 비교 예제
 * 
 * valueOf() 메소드로 생성된 인스턴스 변수는
 * 객체의 효율적 사용을 위해 다음과 같은 범위 내의 값은 동일한 주소를 공유
 * 
 * boolean				true, false
 * char					\u0000 ~ \u007f
 * byte, short, int		-128 ~ 127
 */
package Wrapper;

public class Ex4 {

	public static void main(String[] args) {

		Integer iValue1 = Integer.valueOf(10);
		Integer iValue2 = Integer.valueOf(10);

		System.out.println("동일한 주소? : " + (iValue1 == iValue2));
		System.out.println("동일한 값? : " + iValue1.equals(iValue2));
		
		Integer iValue3 = Integer.valueOf(128);
		Integer iValue4 = Integer.valueOf(128);

		System.out.println("동일한 주소? : " + (iValue3 == iValue4));
		System.out.println("동일한 값? : " + iValue3.equals(iValue4));
	}

}
