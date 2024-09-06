
/**
 * 메소드 오버라이딩, 업캐스팅 활용 예제
 */
class DObject {

	public DObject dObject;

	public DObject() {

		this.dObject = this;
	}

	public void draw() {

		System.out.println("도형 그리기");
	}
}

class Line extends DObject {

	@Override
	public void draw() {

		System.out.println("선 그리기");
	}
}

class Circle extends DObject {

	@Override
	public void draw() {

		System.out.println("원 그리기");
	}
}

public class Ex2 {

	public static void main(String[] args) {

		Line line = new Line();
		line.draw();

		Circle circle = new Circle();
		circle.draw();

		DObject dCircle = new Circle();
		dCircle.draw();
	}

}
