package app;

import pack1.A;
//import pack2.B;		// my_module_a 프로젝트의 module 파일에서 exports 를 취소했기에 에러 발생
import pack3.C;

public class Main {

	public static void main(String[] args) {

		A a = new A();
		a.method();
		
		// my_module_a 모듈에서 B 클래스가 은닉화 되었기에 사용 불가
		// 
//		B b = new B();
//		b.method();
		
		C c = new C();
		c.method();
	}

}
