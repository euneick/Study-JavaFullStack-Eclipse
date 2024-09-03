
class SimpleMath1 {
	public static final double PI = 3.1415;

	public static double add(double n1, double n2) {
		return n1 + n2;
	}

	public static double min(double n1, double n2) {
		return n1 - n2;
	}

	public static double mul(double n1, double n2) {
		return n1 * n2;
	}
}

class AreaMath1 {

	public static double calCircleArea(double rad) {

		return SimpleMath1.mul(SimpleMath1.mul(rad, rad), SimpleMath1.PI);
	}

}

class PerimeterMath1 {

	public static double calRectanglePeri(double width, double height) {

		return SimpleMath1.mul(SimpleMath1.add(width, height), 2);
	}
}

public class HowMethod2 {

	public static void main(String[] args) {

		System.out.println(AreaMath1.calCircleArea(2.4));
		System.out.println(PerimeterMath1.calRectanglePeri(2.0, 4.0));
	}
}
