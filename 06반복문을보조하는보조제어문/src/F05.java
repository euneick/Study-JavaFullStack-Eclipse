
/**
 * for문을 이용한 무한 루프
 */
public class F05 {

	public static void main(String[] args) {

		int i = 0;
		for (;;) {
			System.out.println("Fall Wonderland");

			if (++i >= 10)
				break;
		}
		System.out.println("The End");
	}

}
