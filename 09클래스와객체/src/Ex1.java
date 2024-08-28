
/**
 * 객체 메모리 생성 및 속성, 메소드 사용
 */
class Tv {

	String color;
	boolean power;
	int channel;

	public void togglePower() {

		power = !power;
	}

	public void channelUp() {

		channel++;
	}

	public void channelDown() {

		channel--;
	}
}

public class Ex1 {

	public static void main(String[] args) {

		Tv t = new Tv();

		t.color = "red";
		t.channel = 7;
		t.power = true;

		t.channelDown();
		System.out.println("현재 채널 : " + t.channel);
	}

}
