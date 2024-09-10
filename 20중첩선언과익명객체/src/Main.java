
/**
 * 중첩 클래스 활용 예제
 */
class Car {

	static class Engine {

		private int power;

		public Engine(int power) {

			this.power = power;
		}

		public void showEngineInfo() {

			System.out.println("엔진 출력 : " + power + " 마력");
		}
	}

	private String model;
	private Engine engine;

	public Car(String model, int enginePower) {

		this.model = model;
		engine = new Engine(enginePower);
	}

	public void showCarInfo() {

		System.out.println("모델 : " + model);
		engine.showEngineInfo();
	}
}

public class Main {

	public static void main(String[] args) {

		Car myCar = new Car("Hyundai Sonata", 180);
		
		myCar.showCarInfo();
	}

}
