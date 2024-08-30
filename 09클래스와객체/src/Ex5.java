
/**
 * 기본 자료형과 참조 자료형 비교 해보기
 */
class MyDate {

	int year = 2016;
	int month = 1;
	int day = 5;
}

public class Ex5 {

	public static void main(String[] args) {

		int x = 7;
		int y = x;

		System.out.println("Call by value");
		System.out.println("x : " + x + ", y : " + y);

		y = 20;
		System.out.println("x : " + x + ", y : " + y);

		System.out.println();

		MyDate date = new MyDate();
		MyDate date2 = date;

		System.out.println("Call by reference");
		System.out.printf("%d년 %d월 %d일\n", date.year, date.month, date.day);
		date2.year = 2024;
		System.out.printf("%d년 %d월 %d일\n", date.year, date.month, date.day);
	}

}
