
public class Opr02_05 {

	public static void main(String[] args) {

		// 문제. 조건식을 작성 해보자
		int x = 10;
		int year = 2024;
		char ch = 'x';
		boolean powerOn = false;

		// 1. int 변수 x가 10보다 크고 20보다 작을 때 연산 결과 값이 true인 조건식
		System.out.println(x > 10 && x < 20);
		
		// 2. char형 변수 ch가 공백이나 탭이 아닐 때 연산 결과 값이 true인 조건식
		System.out.println(!(ch == '\t' || ch == ' '));

		// 3. char형 변수 ch가 'x' 또는 'X'일때 연산 결과 값이 true인 조건식
		System.out.println(ch == 'x' || ch == 'X');

		// 4. char형 변수 ch가 숫자형태의 문자('0' ~ '9')일때 연산 결과 값이 true인 조건식
		System.out.println(ch >= 48 && ch <= 57);

		// 5. char형 변수 ch가 영문자(대문자 또는 소문자)일때 연산 결과 값이 true인 조건식
		System.out.println((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122));

		// 6. int형 변수 year가 400으로 나눠떨어지거나 4로 나눠떨어지고 100으로 나눠떨어지지 않을 때 연산 결과 값이 true인 조건식
		System.out.println((year % 400 == 0) || (year % 4 == 0 || year % 100 != 0));

		// 7. boolean형 변수 powerOn이 false일때 연산 결과 값이 true인 조건식
		System.out.println(!powerOn);
	}

}
