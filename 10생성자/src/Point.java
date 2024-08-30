
/**
 * 생성자 만들어보고 사용
 */
public class Point {

	int x, y;
	
	public Point() {
		
		x = 2;
		y = 2;
		
		System.out.println("Point 기본생성자 호출 됨");
	}
	
	public Point(int _x) { x = _x; }
	public Point(int _x, int _y) { x = _x; y = _y; }
	
	public int getX() { return x; }
	public void setX(int _x) { x = _x; }
	
	public int getY() { return y; }
	public void setY(int _y) { y = _y; }
	
	public void prn() {

		System.out.printf("출력 x, y : %d, %d\n", x, y);
	}
	
	public static void main(String[] args) {

		Point p1 = new Point();
		
		System.out.printf("객체변수 x = %d\n객체변수 y = %d\n", p1.x, p1.y);
		p1.prn();
		
		p1.x = 10;	p1.y = 20;
		p1.prn();
		
		p1.setX(100);	p1.setY(200);
		p1.prn();
		
		System.out.println(p1.getX());
		System.out.println(p1.getY());
		
		System.out.println("============================================");
		
		Point p2 = new Point(300);
		
		p2.prn();

		System.out.println("============================================");
		
		Point p3 = new Point(300, 400);
		
		p3.prn();
	}

}
