
/**
 * 중첩 클래스 - 바깥 클래스의 객체 접근 예제
 */
package sec05.exam02;

class A {
	
	String field = "A field";
	
	void method() {
		
		System.out.println("A method");
	}
	
	//인스턴스 멤버 클래스
	class B {
		
		String field = "B field";
		
		void method() {
			
			System.out.println("B method");
		}
		
		void print() {
			
			System.out.println(this.field);			// 현재 B 객체
			this.method();
			
			System.out.println(A.this.field);		// 바깥 A 객체
			A.this.method();
		}
	}
	
	void useB() {
		
		B b = new B();
		b.print();
	}
}

public class AExample {

	public static void main(String[] args) {
		
		A a = new A();
		
		a.useB();
	}

}
