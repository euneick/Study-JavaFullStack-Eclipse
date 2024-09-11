package app;

import pack1.A;
import pack2.B;

public class Main {

	public static void main(String[] args) {

		// 외부 라이브러리 jar 에서 import 한 A 클래스
		A a = new A();
		a.method();

		// 외부 라이브러리 jar 에서 import 한 B 클래스
		B b = new B();
		b.method();
	}

}
