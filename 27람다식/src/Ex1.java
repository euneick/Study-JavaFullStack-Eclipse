import java.util.function.Function;

/**
 * 람다식 예제
 * 		(매개변수) -> { 기능 구현; }  
 * 
 * 함수형 인터페이스 Function<T, R>
 * 
 * 		T : 입력 타입
 * 		R : 반환 타입
 * 
 * 		apply() 메소드를 통해 익명객체의 리턴값을 받을 수 있음
 */
public class Ex1 {

	public static void main(String[] args) {

		
//		Function<Integer, String> intToString = new Function<Integer, String>() {
//			
//			@Override
//			public String apply(Integer i) {
//				return "숫자 : " + i;
//			}
//		};
		
		// 람다식을 활용한 익명객체로 코드 간소화
//		Function<Integer, String> intToString = (i) -> { return "숫자 : " + i; };
		Function<Integer, String> intToString = i -> "숫자 : " + i;

		System.out.println(intToString.apply(5));
	}

}
