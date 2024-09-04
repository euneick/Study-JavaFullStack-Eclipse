
/**
 * 접근제어자 예제
 */
class AA {

	int i;
	protected int pro;
	public int pub;
	private int pri;

	public int getPri() {
		return pri;
	}

	public void setPri(int pri) {
		this.pri = pri;
	}
}

class BB extends AA {

	void set() {

		super.i = 1;
		super.pro = 2;
		super.setPri(3);
		super.pub = 4;
	}

	public String get() {

		return super.i + ", " + super.pro + ", " + super.pub + ", " + super.getPri();
	}
}

public class Ex4 {

	public static void main(String[] args) {

		BB b = new BB();
		
		b.set();
		System.out.println(b.get());
	}

}
