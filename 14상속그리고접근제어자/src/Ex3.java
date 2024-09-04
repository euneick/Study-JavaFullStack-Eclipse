
/**
 * 접근제어자 예제
 */
class A {

	public int p;

	private int n;

	public void setN(int n) {
		this.n = n;
	}

	public int getN() {
		return n;
	}
}

class B extends A {

	private int m;

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public String toString() {
		return "n=" + super.getN() + " m=" + this.getM();
	}
}

public class Ex3 {

	public static void main(String[] args) {

		A a = new A();
		
		a.p = 5;
		
		B b = new B();
		
		b.p = 5;
		
		b.setN(10);
		b.setM(20);
		
		System.out.println(b.toString());
	}

}
