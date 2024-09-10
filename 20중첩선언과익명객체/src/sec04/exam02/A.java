
/**
 * 로컬 중첩 클래스 작성 시 로컬 변수의 특징 예제
 */
package sec04.exam02;

public class A {
	
	public void method1(int arg) {
		
		// final int var = 1;
		int var = 1;
		
		class B {
			
			void method2() {
				
				System.out.println("arg : " + arg);
				System.out.println("var : " + var);
				
//				arg = 2;
//				var = 2;
			}
		}
		
		B b = new B();
		
		b.method2();
		
//		arg = 2;
//		var = 2;
	}
}
