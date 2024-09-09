
/**
 * 다중 인터페이스 예제
 */
package ch08.sec08;

interface RemoteControl {
	
	void turnOn();
	void turnOff();
}

interface Searchable {
	
	void search(String url);
}

class SmartTelevision implements RemoteControl, Searchable {

	@Override
	public void turnOn() {
		
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void search(String url) {
		
		System.out.println(url + "을 검색합니다.");
	}
}

public class MultiInterfaceImplExample {

	public static void main(String[] args) {

		RemoteControl remoteControl = new SmartTelevision();
		
		remoteControl.turnOn();
		remoteControl.turnOff();
		
		Searchable searchable = new SmartTelevision();
		
		searchable.search("https://www.youtube.com");
	}

}
