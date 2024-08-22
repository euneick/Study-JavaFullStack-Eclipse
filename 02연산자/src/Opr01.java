
/**
 * 수치 데이터로 사칙연산하기
 */
public class Opr01 {

	public static void main(String[] args) {

		int a = 10, b = 4, c = 0;

		c = a + b;
		System.out.printf("%d + %d = %d\n", a, b, c);
		c = a - b;
		System.out.printf("%d - %d = %d\n", a, b, c);
		c = a * b;
		System.out.printf("%d * %d = %d\n", a, b, c);
		c = a / b;
		System.out.printf("%d / %d = %d\n", a, b, c);
		c = a % b;
		System.out.printf("%d %% %d = %d\n", a, b, c);
		
	}

}
