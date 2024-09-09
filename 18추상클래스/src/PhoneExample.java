
/**
 * 추상클래스 예제
 */
abstract class Phone {
	
	private String owner;
	
	public Phone(String owner) {
		
		this.owner = owner;
	}
	
	public void turnOn() {
		
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		
		System.out.println("폰 전원을 끕니다.");
	}
}

class SmartPhone extends Phone {

	public SmartPhone(String owner) {
		super(owner);
	}
	
	public void searchInternet() {
		
		System.out.println("인터넷을 검색합니다.");
	}
}

public class PhoneExample {

	public static void main(String[] args) {
		
//		Phone phone = new Phone();	 // 추상 클래스 생성 불가
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.searchInternet();
		smartPhone.turnOff();
	}

}
