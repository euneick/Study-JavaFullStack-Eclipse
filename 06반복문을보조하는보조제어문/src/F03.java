
/**
 * 1부터 10사이의 정수 중 3의 배수만 제외하고 출력하기
 */
public class F03 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0)
				continue;

			System.out.print(i + " ");
		}
	}

}
