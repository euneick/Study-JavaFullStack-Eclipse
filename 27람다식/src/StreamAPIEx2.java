import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Stream API 예제
 * 
 * 		collect()
 * 		 - 스트림의 요소들을 특정 형식으로 수집하고, 그 결과를 새로운 컬렉션으로 반환
 * 		 - 스트림을 처리한 후 최종 결과를 얻기 위함
 * 
 * 		Collectors.toList()
 * 		 - 다양한 형태로 데이터를 수집하기 위한 유틸리티 클래스
 * 		 - 다양한 컬렉션으로 데이터를 수집 할 수 있는 메소드를 제공
 * 		 * toList()
 * 			- 스트림 내의 모든 요소를 List 형태로 수집
 * 			- 모든 데이터들을 List 인터페이스 타입으로 반환
 */
public class StreamAPIEx2 {

	public static void main(String[] args) {

		List<Integer> scores = Arrays.asList(1, 2, 3, 4, 5, 6);

		List<Integer> resultScores = scores.stream()
				.filter(n -> n > 2)
				.filter(n -> n % 2 == 0)
				.collect(Collectors.toList());

		System.out.println(resultScores);
	}
}
