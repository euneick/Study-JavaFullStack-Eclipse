
/**
 * 익명 객체 예제
 */
package sec07.exam01;

class Tire {

	public void roll() {

		System.out.println("일반 타이어가 굴러갑니다.");
	}
}

class Car {

	private Tire tire1 = new Tire();
	private Tire tire2 = new Tire() {

		@Override
		public void roll() {

			System.out.println("익명 자식 Tire 객체 1이 굴러갑니다.");
		}
	};

	public void run1() {

		tire1.roll();
		tire2.roll();
	}

	public void run2() {

		Tire tire = new Tire() {

			@Override
			public void roll() {

				System.out.println("익명 자식 Tire 객체 2가 굴러갑니다.");
			}
		};
		tire.roll();
	}

	public void run3(Tire tire) {
		tire.roll();
	}
}

public class CarExample {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.run1();
		
		car.run2();
		
		car.run3(new Tire() {
			@Override
			public void roll() {
				
				System.out.println("익명 자식 Tire 객체 3이 굴러갑니다.");
			}
		});
	}

}
