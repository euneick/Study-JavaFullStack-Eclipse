package pack1;

import pack2.B;

public class A {

	public void method() {
		
		System.out.println("A method 실행");
		
		B b = new B();
		b.method();
	}
}
