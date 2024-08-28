
class Circle {

	double radius;

	public void setRadius(double radius) {

		this.radius = radius;
	}

	public double getCircleArea() {

		return radius * radius * 3.14;
	}
}

class Rectangle {

	double width;
	double height;

	public void setDimensions(double width, double height) {

		this.width = width;
		this.height = height;
	}

	public double getRectangleArea() {

		return width * height;
	}
}

public class Ex3 {

	public static void main(String[] args) {

		Circle circle = new Circle();
		circle.setRadius(5);
		System.out.println(circle.getCircleArea());

		Circle circle2 = new Circle();
		circle2.setRadius(3);
		System.out.println(circle2.getCircleArea());
		
		Rectangle rectangle = new Rectangle();
		rectangle.setDimensions(5, 10);
		System.out.println(rectangle.getRectangleArea());
	}

}
