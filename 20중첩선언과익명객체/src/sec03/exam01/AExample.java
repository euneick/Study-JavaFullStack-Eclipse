
/**
 * 중첩 클래스 - 정적 멤버 클래스
 */
package sec03.exam01;

class A {

	// 정적 멤버 클래스
	static class B {}
	
	B field1 = new B();
	
	static B field2 = new B();
	
	A() { B b = new B(); }
	
	void method1() { B b = new B(); }
	
	static void method2() { B b = new B(); }
}

public class AExample {

	public static void main(String[] args) {
		
		A.B b = new A.B();
	}

}
