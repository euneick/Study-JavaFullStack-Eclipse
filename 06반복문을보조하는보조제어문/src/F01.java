
/**
 * break문의 사용 예 1
 */
public class F01 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0)
				break;

			System.out.print(i + " ");
		}
	}

}
