
/**
 * 가변길이 매개변수를 가진 메소드
 */
public class Example5 {

	public static int sum(int... numbers) {

		int total = 0;

		for (int number : numbers) {
			total += number;
		}

		return total;
	}

	public static void main(String[] args) {

		System.out.println(sum(1, 2, 3));
		System.out.println(sum(1, 2, 3, 4, 5));
	}

}
