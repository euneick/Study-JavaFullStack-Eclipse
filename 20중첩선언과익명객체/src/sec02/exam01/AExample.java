
/**
 * 중첩클래스 예제
 */
package sec02.exam01;

class A {
	
	// 인스턴스 멤버 클래스
	class B {}
	
	B field = new B();
	
	public A() {
		
		B b = new B();
	}
	
	void method() {
		
		B b = new B();
	}
}

public class AExample {

	public static void main(String[] args) {

		A a = new A();
		
		A.B b = a.new B();
	}

}
