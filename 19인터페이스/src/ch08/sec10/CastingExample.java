
/**
 * 인터페이스 강제 타입 변환 예제
 */
package ch08.sec10;

interface Vehicle {
	
	void run();
}

class Bus implements Vehicle {

	@Override
	public void run() {
	
		System.out.println("버스가 달립니다.");
	}
	
	public void checkFare() {
		
		System.out.println("승차요금을 체크합니다.");
	}
}

public class CastingExample {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();
	}

}
