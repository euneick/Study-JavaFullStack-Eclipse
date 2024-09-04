
/**
 * 클래스 상속 예제
 */
class Point2D {

	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}

class Point3D extends Point2D {

	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
}

public class Ex2 {

	public static void main(String[] args) {

		Point3D point3d = new Point3D();

		point3d.setX(10);
		point3d.setY(20);
		point3d.setZ(30);

		System.out.printf("point3d의 좌표 : (%d, %d, %d)\n", point3d.getX(), point3d.getY(), point3d.getZ());
	}

}
