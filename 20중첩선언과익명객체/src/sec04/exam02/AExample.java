
/**
 * 중첩 클래스 - 로컬 클래스
 */
package sec04.exam02;

class A {
	
	void useB() {
		
		class B {
			
			int field1 = 1;
			
			static int field2 = 2;
			
			B() {
				
				System.out.println("B 생성자 실행");
			}
			
			void method1() {
				
				System.out.println("B method1 실행");
			}
			
			static void method2() {
				
				System.out.println("B method2 실행");
			}
		}
		
		B b = new B();
		
		System.out.println(b.field1);
		b.method1();
		
		System.out.println(B.field2);
		B.method2();
	}
}

public class AExample {

	public static void main(String[] args) {

		A a = new A();
		
		a.useB();
	}

}
