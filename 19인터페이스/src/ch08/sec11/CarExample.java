
/**
 * 인터페이스 필드의 다형성 예제
 */
package ch08.sec11;

interface Tire {

	void roll();
}

class HankookTire implements Tire {

	@Override
	public void roll() {

		System.out.println("한국 타이어가 굴러갑니다.");
	}
}

class KumhoTire implements Tire {

	@Override
	public void roll() {

		System.out.println("금호 타이어가 굴러갑니다.");
	}
}

class Car {

	Tire tire1 = new HankookTire();
	Tire tire2 = new HankookTire();

	public void run() {

		tire1.roll();
		tire2.roll();
	}
}

public class CarExample {

	public static void main(String[] args) {

		Car myCar = new Car();
		
		myCar.run();
		
		myCar.tire1 = new KumhoTire();
		myCar.tire2 = new KumhoTire();
		
		myCar.run();
	}

}
