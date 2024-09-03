
class SimpleMath {

	public static final double PI = 3.1415;

	public double add(double n1, double n2) {
		return n1 + n2;
	}

	public double min(double n1, double n2) {
		return n1 - n2;
	}

	public double mul(double n1, double n2) {
		return n1 * n2;
	}
}

class AreaMath {

	public double calCircleArea(double rad) {

		SimpleMath math = new SimpleMath();

		double result = math.mul(rad, rad);
		result = math.mul(result, SimpleMath.PI);

		return result;
	}
}

class PerimeterMath {

	public double calRectanglePeri(double width, double height) {

		SimpleMath math = new SimpleMath();

		return math.mul(math.add(width, height), 2);
	}
}

public class HowMethod {

	public static void main(String[] args) {

		AreaMath areaMath = new AreaMath();
		System.out.println(areaMath.calCircleArea(2.4));

		PerimeterMath perimeterMath = new PerimeterMath();
		System.out.println(perimeterMath.calRectanglePeri(2.0, 4.0));
	}
}
