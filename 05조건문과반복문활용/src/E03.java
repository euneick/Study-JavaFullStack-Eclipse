
/**
 * 2단부터 9단까지 구구단 출력하기
 */
public class E03 {

	public static void main(String[] args) {

		for (int i = 2; i < 10; i++) {
			System.out.println("** " + i + " 단 **");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println();
		}
	}

}
