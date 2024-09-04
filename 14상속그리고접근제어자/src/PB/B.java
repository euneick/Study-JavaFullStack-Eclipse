
/**
 * 부모클래스와 자식클래스가 다른 패키지에 있는 경우 다양한 접근제어자를 지정한 멤버의 접근 예제
 */
package PB;

import PA.A;

public class B extends A{
	
	void set() {
		
		super.pro = 2;
		super.pub = 4;
	}
	
	public static void main(String[] args) {
		
		B b = new B();
		
		b.set();
		b.print();
	}
}
