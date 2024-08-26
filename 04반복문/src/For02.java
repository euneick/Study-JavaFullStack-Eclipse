
/**
 * for문의 다양한 활용
 */
public class For02 {

	public static void main(String[] args) {

		int i;

		for (i = 1; i <= 10; i++)
			System.out.print(i + " ");

		System.out.println("\n---------------------");

		for (i = 1; i <= 10; i += 2)
			System.out.print(i + " ");

		System.out.println("\n---------------------");

		for (i = 2; i <= 10; i += 2)
			System.out.print(i + " ");

		System.out.println("\n---------------------");

		for (i = 10; i >= 1; i--)
			System.out.print(i + " ");
	}

}
