
/**
 * 다중 for문에서 제어변수의 변화 알아보기
 */
public class E02 {

	public static void main(String[] args) {

		int i, j;

		System.out.println("i (바깥 쪽 제어변수) ---->> j (안 쪽 제어변수)");

		for (i = 1; i < 5; i++) {
			for (j = 1; j <= 5; j++) {
				System.out.println(i + " ------------------->> " + j);
			}
			System.out.println();
		}
	}

}
