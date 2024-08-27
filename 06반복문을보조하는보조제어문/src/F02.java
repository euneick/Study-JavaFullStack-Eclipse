
/**
 * break문의 사용 예 2
 */
public class F02 {

	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {

			for (int j = 1; j <= 10; j++) {

				if (j % 3 == 0)
					break;

				System.out.print("j : " + j + "\t");
			}
			System.out.println("\ni : " + i);
		}

		System.out.println("\n----------------------------\n");

		exit_for: 
			for (int i = 1; i < 10; i++) {

				for (int j = 1; j <= 10; j++) {
	
					if (j % 3 == 0)
						break exit_for;
	
					System.out.print("j : " + j + "\t");
				}
	
				System.out.println("\ni : " + i);
			}
	}

}
