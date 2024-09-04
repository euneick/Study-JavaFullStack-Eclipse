
/**
 * 부모클래스와 자식클래스가 같은 패키지에 있는 경우 다양한 접근제어자를 지정한 멤버 변수 또는 메소드 예제
 */
class Super {

	public int num1 = 10;
	protected int num2 = 20;
	int num3 = 30;
	private int num4 = 40;

	public int getNum4() {
		return num4;
	}
}

class Sub extends Super {

	private int num5;

	public void print() {

		System.out.println(super.num1);
		System.out.println(super.num2);
		System.out.println(super.num3);
		System.out.println(super.getNum4());
		System.out.println(this.num5);
	}
}

public class Test2 {

	public static void main(String[] args) {

		Sub sub = new Sub();

		sub.print();
	}

}
