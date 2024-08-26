
/**
 * 1 부터 10 사이의 짝수의 합과 홀수의 합을 구하기
 */
public class E01 {

	public static void main(String[] args) {

		int n;
		int even_tot, odd_tot;

		for (even_tot = 0, n = 2; n <= 10; n += 2)
			even_tot += n;

		for (odd_tot = 0, n = 1; n <= 10; n += 2)
			odd_tot += n;

		System.out.println("짝수의 합 : " + even_tot);
		System.out.println("홀수의 합 : " + odd_tot);
	}

}
