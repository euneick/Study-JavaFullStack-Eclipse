/*
문제. 아래는 변수 num의 값에 따라 '양수', '음수', '0'을 출력하는 코드이다.
     삼항 연산자를 이용해서 (1)에 알맞은 코드를 넣으시오.
힌트) 삼항 연산자를 두 번 사용하라.

출력결과
양수
 */
public class Opr08_02 {

	public static void main(String[] args) {

		int num = 10;
		System.out.println(num == 0 ? "0" : num > 0 ? "양수" : "음수");
	}

}
