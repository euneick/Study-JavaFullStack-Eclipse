
/**
 * 중첩 클래스 - 정적 멤버 클래스
 */
package sec03.exam02;

class A {
	
	// 정적 멤버 클래스
	static class B {
		
		int field1 = 1;
		
		static int field2 = 2;
		
		B() {
			
			System.out.println("B 생성자 실행");
		}
		
		void method1() {
			
			System.out.println("B 메소드1 실행");
		}
		
		static void method2() {
			
			System.out.println("B 메소드2 실행");
		}
	}
}

public class AExample {

	public static void main(String[] args) {
		
		A.B b = new A.B();
		
		System.out.println(b.field1);
		b.method1();
		
		System.out.println(A.B.field2);
		A.B.method2();
	}

}
