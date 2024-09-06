
/**
 * 메소드 오버라이딩 예제
 */
class A {

	public void print(int num) {

		System.out.println(num);
	}
}

class B extends A {

	@Override
	public void print(int num) {

		System.out.println(num * num);
	}
}

public class Ex1 {

	public static void main(String[] args) {

		A a = new A();
		a.print(5);

		B b = new B();
		b.print(5);		// 오버라이드된 메소드 호출
	}

}
