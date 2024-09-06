
/**
 * 업캐스팅 예제
 */
class Tv {
	
	boolean power;
	int channel;
	
	public Tv() {}
	
	public void togglePower() { power = !power; }
	public void onChannelUp() { channel++; }
	public void onChannelDown() { channel--; }
}

class CaptionTv extends Tv {
	
	String text;
	
	public void onCaption() {
		
		System.out.println("캡션 기능이 추가된 Caption TV");
	}
}

public class Ex1 {

	public static void main(String[] args) {

		Tv tv = new Tv();
		tv.power = true;
		tv.channel = 0;
		tv.togglePower();
		tv.onChannelUp();
		tv.onChannelDown();

		CaptionTv captionTv = new CaptionTv();
		captionTv.power = true;
		captionTv.channel = 0;
		captionTv.togglePower();
		captionTv.onChannelUp();
		captionTv.onChannelDown();
		captionTv.text = "캡션TV";
		captionTv.onCaption();

		Tv upCastingTv = new CaptionTv();
		upCastingTv.power = true;
		upCastingTv.channel = 0;
		upCastingTv.togglePower();
		upCastingTv.onChannelUp();
		upCastingTv.onChannelDown();
//		upCastingTv.text = "";
//		upCastingTv.onCaption();
	}

}
