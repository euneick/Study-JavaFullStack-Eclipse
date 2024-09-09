
/**
 * 인터페이스 상속 예제
 */
package ch08.sec09;

interface InterfaceA {
	
	void methodA();
}

interface InterfaceB {
	
	void methodB();
}

// 클래스 상속과는 달리 다중 상속이 가능
interface InterfaceC extends InterfaceA, InterfaceB {
	
	void methodC();
}

class InterfaceCImpl implements InterfaceC {

	@Override
	public void methodA() {

		System.out.println("InterfaceCImpl-methodA() 실행");
	}

	@Override
	public void methodB() {

		System.out.println("InterfaceCImpl-methodB() 실행");
	}

	@Override
	public void methodC() {

		System.out.println("InterfaceCImpl-methodC() 실행");
	}
}

public class ExtendsExample {

	public static void main(String[] args) {
		
		InterfaceCImpl impl = new InterfaceCImpl();
		
		InterfaceA ia = impl;
		ia.methodA();
//		ia.methodB();
		
		System.out.println();
		
		InterfaceB ib = impl;
//		ib.methodA();
		ib.methodB();
		
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
