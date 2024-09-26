import java.util.function.Consumer;

/**
 * 람다식 예제
 * 		(매개변수) -> { 기능 구현; }  
 * 
 * 함수형 인터페이스 Consumer<T>
 * 
 * 		T : 입력타입
 * 		반환타입은 void
 * 
 * 		accept() 메소드를 통해 익명객체의 로직을 실행
 */
public class Ex3 {

	public static void main(String[] args) {

		Consumer<String> print = s -> System.out.println("입력한 문자열 : " + s);
		
		print.accept("hello");
	}

}
