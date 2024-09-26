import java.util.function.Predicate;

/**
 * 람다식 예제
 * 		(매개변수) -> { 기능 구현; }  
 * 
 * 함수형 인터페이스 Predicate<T>
 * 
 * 		T : 입력 타입
 * 		반환타입은 Boolean
 * 
 * 		test() 메소드를 통해 익명객체의 로직을 실행
 */
public class Ex2 {

	public static void main(String[] args) {

		Predicate<String> isEmpty = s -> s.isEmpty();
		
		System.out.println(isEmpty.test("hello"));
		System.out.println(isEmpty.test(new String()));
	}

}
