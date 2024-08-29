
public class Main {

	public static void main(String[] args) {

		Car myCar = new Car();

		myCar.color = "red";
		myCar.model = "Sonata";
		myCar.madeYear = 2020;
		myCar.currentSpeed = 0;
		myCar.fuelLevel = 50;
		myCar.engineStatus = false;

		myCar.start();
		myCar.accelerate(30);
		myCar.decelerate(10);
		myCar.refuel(20);
		myCar.stop();
	}

}
