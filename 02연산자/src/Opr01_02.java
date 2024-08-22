
/**
 * 다양한 자료형들을 이용해 산술연산하기
 */
public class Opr01_02 {

	public static void main(String[] args) {

		int intValue1 = 10;
		int intValue2 = 20;

		double doubleValue1 = 5.5;

		System.out.println(intValue1 + intValue2);
		System.out.println(intValue1 + doubleValue1);
		System.out.println(doubleValue1 + 3.3);

		System.out.println(intValue2 * doubleValue1);

		System.out.println((double) intValue1 / 3);

		System.out.println((int) doubleValue1);

		System.out.println(doubleValue1 % 3);
	}

}
