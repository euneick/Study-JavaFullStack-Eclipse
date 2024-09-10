
/**
 * 중첩클래스 예제 - 인스턴스 멤버 클래스
 */
package sec02.exam02;

class A {

	// 인스턴스 멤버 클래스
	class B {

		int field1 = 1;

		static int field2 = 2;

		B() {

			System.out.println("B 생성자 실행");
		}

		void method1() {

			System.out.println("B Method1 실행");
		}

		static void method2() {

			System.out.println("B Method2 실행");
		}
	}

	public void useB() {

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
