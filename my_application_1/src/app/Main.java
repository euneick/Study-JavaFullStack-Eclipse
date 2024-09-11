
/**
 * 외부 라이브러리로 사용할 프로젝트를 jar 파일로 export한 이후
 * 해당 프로젝트에 build path - configure bulid path - class path에 export한 jar파일 경로를 추가하여 사용
 */
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
