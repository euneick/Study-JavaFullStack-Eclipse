
/**
 * static 초기화 블럭 및 호출 순서 예제
 */
public class Ex3 {
	
	int door = 4;
	
	public Ex3() {
		
		System.out.println("생성자 호출");
		this.door = 10;
	}
	
	// 클래스 초기화 블럭
	static {
		System.out.println("static 초기화 블럭 호출");
	}
	
	// 인스턴스 초기화 블럭
	{
		System.out.println("인스턴스 초기화 블럭 호출");
	}

	public static void main(String[] args) {

		System.out.println("main 메소드 진입");
		
		Ex3 ex3 = new Ex3();
		
		Ex3 ex4 = new Ex3();
	}

}
