
/**
 * 메소드 오버라이딩, 업캐스팅, 다운캐스팅 활용 예제
 */
class 해장국 {

	public void 간맞추기() {

		System.out.println("소금치기");
	}
}

class 뼈다귀해장국 extends 해장국 {

	@Override
	public void 간맞추기() {

		System.out.println("들깨가루 넣기");
	}

	public void 뼈추가하기() {

		System.out.println("뼈 추가");
	}
}

class 콩나물해장국 extends 해장국 {

	@Override
	public void 간맞추기() {

		System.out.println("고춧가루 넣기");
	}

	public void 콩나물넣기() {

		System.out.println("콩나물 넣기");
	}
}

class 취객 {

	public void 해장국간맞추기(해장국 해장국) {

		해장국.간맞추기();
	}
}

public class Test2 {

	public static void main(String[] args) {

		취객 취객1 = new 취객();

		해장국 _뼈다귀해장국 = new 뼈다귀해장국();	// 업캐스팅
		
		취객1.해장국간맞추기(_뼈다귀해장국);
		((뼈다귀해장국)_뼈다귀해장국).뼈추가하기();		// 다운캐스팅

		해장국 _콩나물해장국 = new 콩나물해장국();	// 업캐스팅
		
		취객1.해장국간맞추기(_콩나물해장국);
		((콩나물해장국)_콩나물해장국).콩나물넣기();		// 다운캐스팅
	}

}
