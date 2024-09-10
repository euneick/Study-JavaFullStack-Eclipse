
/**
 * 익명 구현 객체 예제
 */
package sec07.exam02;

interface RemoteControl {

	void turnOn();
	void turnOff();
}

class Home {

	private RemoteControl rc = new RemoteControl() {

		@Override
		public void turnOn() {

			System.out.println("TV를 켭니다.");
		}

		@Override
		public void turnOff() {

			System.out.println("TV를 끕니다.");
		}
	};
	
	public void use1() {
		
		rc.turnOn();
		rc.turnOff();
	}
	
	public void use2() {
		
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {

				System.out.println("에어컨를 켭니다.");
			}
			
			@Override
			public void turnOff() {

				System.out.println("에어컨를 끕니다.");
			}
		};
		
		rc.turnOn();
		rc.turnOff();
	}
	
	public void use3(RemoteControl rc) {
		
		rc.turnOn();
		rc.turnOff();
	}
}

public class HomeExample {

	public static void main(String[] args) {
		
		Home home = new Home();
		
		home.use1();
		
		home.use2();
		
		home.use3(new RemoteControl() {
			
			@Override
			public void turnOn() {
				
				System.out.println("난방을 켭니다.");
			}
			
			@Override
			public void turnOff() {

				System.out.println("난방을 끕니다.");
			}
		});
	}

}
