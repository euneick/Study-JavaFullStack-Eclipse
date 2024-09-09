
/**
 * 인터페이스 예제
 */
package ch08.sec07;

interface Service {

	/*
	 * private 메소드
	 *  - default 메소드 안에서만 호출 가능
	 */
	private void defaultCommon() {

		System.out.println("defaultMethod 중복 코드 A");
		System.out.println("defaultMethod 중복 코드 B");
	}

	default void defaultMethod1() {

		System.out.println("defaultMethod1 종속 코드");
		defaultCommon();
	}

	default void defaultMethod2() {

		System.out.println("defaultMethod2 종속 코드");
		defaultCommon();
	}

	/*
	 * static 메소드
	 *  - static 메소드 안에서만 호출 가능
	 */
	private static void staticCommon() {

		System.out.println("staticMethod 중복 코드 C");
		System.out.println("staticMethod 중복 코드 D");
	}

	static void staticMethod1() {

		System.out.println("staticMethod1 종속 코드");
		staticCommon();
	}

	static void staticMethod2() {

		System.out.println("staticMethod2 종속 코드");
		staticCommon();
	}
}

class ServiceImp1 implements Service {

}

public class ServiceExample {

	public static void main(String[] args) {

		Service service = new ServiceImp1();
		
		service.defaultMethod1();
		System.out.println();
		service.defaultMethod2();
		System.out.println();
		
		Service.staticMethod1();
		System.out.println();
		Service.staticMethod2();
		System.out.println();
	}

}
