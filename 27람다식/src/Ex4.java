
/**
 * 사용자 정의 함수형 인터페이스 예제
 */
@FunctionalInterface
interface MathOperation {

	int operation(int n1, int n2);
}

public class Ex4 {

	public static void main(String[] args) {

		MathOperation add = new MathOperation() {

			@Override
			public int operation(int n1, int n2) {

				return n1 + n2;
			}
		};
		System.out.println(add.operation(10, 20));

		MathOperation multiply = (num1, num2) -> num1 * num2;
		System.out.println(multiply.operation(10, 20));
	}

}
