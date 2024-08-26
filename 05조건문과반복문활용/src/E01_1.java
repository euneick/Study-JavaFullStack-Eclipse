
/**
 * for문을 한 번 사용해서 짝수의 합과 홀수의 합 구하기
 */
public class E01_1 {

	public static void main(String[] args) {

		int n;
		int even_tot, odd_tot;

		for (n = 1, even_tot = 0, odd_tot = 0; n <= 10; n++) {
			if(n % 2 == 0) even_tot += n;
			else odd_tot += n;
		}

		System.out.println("짝수의 합 : " + even_tot);
		System.out.println("홀수의 합 : " + odd_tot);
	}

}
