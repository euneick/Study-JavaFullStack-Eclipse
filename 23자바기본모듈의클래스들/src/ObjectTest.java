
/**
 * 자바 base 모듈의 Object 클래스 활용 예제
 */
class Point {

	private int x, y;

	public Point() {
	}

	public Point(int x, int y) {

		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {

		return String.format("(%d, %d)", x, y);
	}
}

public class ObjectTest {

	public static void main(String[] args) {

		Point pt = new Point();

		System.out.println(pt.toString());

		Point pt2 = new Point(10, 20);

		System.out.println(pt2.toString());
		System.out.println(pt2);
	}

}
