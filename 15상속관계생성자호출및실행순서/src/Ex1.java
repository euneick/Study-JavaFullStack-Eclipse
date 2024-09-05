
/**
 * 상속에서의 생성자 호출 및 실행관계
 */
class A {
	public A() {
		System.out.println("생성자A 실행");
	}
}

class B extends A {
	public B() {
		System.out.println("생성자B 실행");
	}
}

class C extends B {
	public C() {
		System.out.println("생성자C 실행");
	}
}

public class Ex1 {

	public static void main(String[] args) {

		C c = new C();
	}

}
