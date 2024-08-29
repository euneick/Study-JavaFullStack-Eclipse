
public class Car {

	String 		color;
	String 		model;
	int			madeYear;
	int 		currentSpeed;
	int 		fuelLevel;
	boolean 	engineStatus;
	
	public void start() {
		
		engineStatus = true;
		System.out.println(model + "의 엔진이 시작되었습니다.");
	}
	
	public void stop() {
		
		engineStatus = false;
		System.out.println(model + "의 엔진이 정지되었습니다.");
		currentSpeed = 0;
	}

	public void accelerate(int increment) {

		if (engineStatus) {
			currentSpeed += increment;
			System.out.println(model + "이(가) 가속되었습니다. 현재 속도 : " + currentSpeed + "km/h");
			fuelLevel -= increment / 10;
		}
		else {
			System.out.println(model + "의 엔진이 꺼져있습니다. 먼저 엔진을 켜주세요.");
		}
	}

	public void decelerate(int decrement) {
		
		if (engineStatus) {
			currentSpeed -= decrement;
			if (currentSpeed < 0) currentSpeed = 0;
			System.out.println(model + "이(가) 감속되었습니다. 현재 속도 : " + currentSpeed + "km/h");
		}
		else {
			System.out.println(model + "의 엔진이 꺼져있습니다. 먼저 엔진을 켜주세요.");
		}
	}
	
	public void refuel(int amount) {

		fuelLevel += amount;
		System.out.println(model + "에 연료가 보충되었습니다. 현재 연료 량 : " + fuelLevel + "L");
	}
}
