
/**
 * 인터페이스 예제
 */
package ch08.sec02;

interface RemoteControl {

	// 인터페이스 내 필드는 모두 public static final 특성을 가짐, 생략 가능 
//	public static final int MAX_VOLUME = 10;
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
//	public abstract void turnOn();
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	/*
	 * Default Method
	 *	- 인터페이스 내부의 메소드는 모두 추상메소드로 작성되지만, 실행 코드를 갖는 메소드를 작성하는 문법
	 */
	public default void setMute(boolean mute) {
		
		if (mute) {
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VOLUME);
		}
		else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	/*
	 * Static Method
	 */
	public static void changeBattery() {
		
		System.out.println("리모콘 건전지를 교환합니다.");
	}
}

class Television implements RemoteControl {

	private int volume;
	
	@Override
	public void turnOn() {
		
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		
		if (volume > RemoteControl.MAX_VOLUME) this.volume = RemoteControl.MAX_VOLUME;
		else if (volume < RemoteControl.MIN_VOLUME) this.volume = RemoteControl.MIN_VOLUME;
		else this.volume = volume;
		
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}
}

class Audio implements RemoteControl {

	private int volume;
	
	private int memoryVolume;
	
	@Override
	public void turnOn() {
		
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		
		System.out.println("Audio를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		
		if (volume > RemoteControl.MAX_VOLUME) this.volume = RemoteControl.MAX_VOLUME;
		else if (volume < RemoteControl.MIN_VOLUME) this.volume = RemoteControl.MIN_VOLUME;
		else this.volume = volume;
		
		System.out.println("현재 Audio 볼륨 : " + this.volume);
	}
	
	@Override
	public void setMute(boolean mute) {

		if (mute) {
			this.memoryVolume = this.volume;
			System.out.println("무음 처리합니다.");
			setVolume(RemoteControl.MIN_VOLUME);
		}
		else {
			System.out.println("무음 해제합니다.");
			setVolume(this.memoryVolume);
		}
	}
}

public class RemoteControlExample {
	
	public static void main(String args[]) {
		
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();

		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println();
		
		RemoteControl.changeBattery();
	}
	
}
