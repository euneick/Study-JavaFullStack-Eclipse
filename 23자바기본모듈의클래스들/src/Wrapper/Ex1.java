
/**
 * Wrapper 클래스 직접 만들어보기
 */
package Wrapper;

class IntWrapper {

	private int num;

	public IntWrapper(int num) {

		this.num = num;
	}

	@Override
	public String toString() {

		return "" + num;
	}
}

class BooleanWrapper {

	private boolean bool;

	public BooleanWrapper(boolean bool) {

		this.bool = bool;
	}

	@Override
	public String toString() {

		return "" + bool;
	}
}

public class Ex1 {

	public static void showData(Object obj) {

		System.out.println(obj.toString());
	}

	public static void main(String[] args) {

		IntWrapper intWrapper = new IntWrapper(7);
		showData(intWrapper);

		showData(new IntWrapper(3));

		showData(new BooleanWrapper(true));
	}

}
