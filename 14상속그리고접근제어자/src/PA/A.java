package PA;

public class A {

	int i;
	protected int pro;
	private int pri;
	public int pub;
	
	public void print() {
		System.out.print("i = " + this.i + ", ");
		System.out.print("pro = " + this.pro + ", ");
		System.out.print("pri = " + this.pri + ", ");
		System.out.println("pub = " + this.pub + " 입니다.");
	}
}
