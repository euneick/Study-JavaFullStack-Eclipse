
/**
 * 객체 생성시 호출 되는 메소드 (생성자) 만들기
 */
class Car {

	String color;
	int year;

	public Car() {

		color = "Black";
		year = 2014;
	}

	public Car(String color, int year) {

		this.color = color;
		this.year = year;
	}

	public void printInfo() {

		System.out.println("색상 : " + color + ", 연식 : " + year);
	}
}

public class Ex1 {

	public static void main(String[] args) {

		Car car1 = new Car();
		Car car2 = new Car("Red", 2024);
		
		car1.printInfo();
		car2.printInfo();
	}

}
