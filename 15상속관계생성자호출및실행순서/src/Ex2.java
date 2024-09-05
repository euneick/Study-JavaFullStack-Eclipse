
/**
 * 상속에서의 생성자 호출 및 실행관계
 */
class AA {
	public AA() {
		System.out.println("AA 기본생성자 호출");
	}
	
	public AA(int x) {
		System.out.println("AA 매개변수생성자 호출");
	}
}

class BB extends AA {
	public BB() {
		System.out.println("BB 기본생성자 호출");
	}
	
	public BB(int x) {
		System.out.println("BB 매개변수생성자 호출");
	}
}

public class Ex2 {
	
	public static void main(String[] args) {
		
		BB b = new BB(5);
	}
}
