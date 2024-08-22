
/**
 * 연습문제 1. 변수에 저장된 값 서로 바꾸기
 */
public class Opr02_01 {

	public static void main(String[] args) {

		int x = 1, y = 2, z = 3;
		int temp = 0;

		temp = x;
		x = y;
		y = temp;

		temp = y;
		y = z;
		z = temp;

		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
	}

}
