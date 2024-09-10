
/**
 * 중첩 클래스 - 바깥 멤버 접근 예제
 */
package sec05.exam01;

public class A {

	int field1;	
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	// 인스턴스 멤버 클래스	
	class B {
		
		void method() {
			
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	// 정적 멤버 클래스
	static class C {
		
		void method() {
			
//			field1 = 10;
//			method1();
			
			field2 = 10;
			method2();
		}
	}
}
