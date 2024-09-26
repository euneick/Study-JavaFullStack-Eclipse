import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Stream API 예제
 * 
 * 		distinct()
 * 		 - 스트림 내 중복된 요소(객체)를 제거
 * 		 - equals() 메소드를 기준으로 중복을 판별
 * 		 - 객체의 경우 equals() 메소드를 적절히 구현해야 정확하게 중복이 제거 됨
 * 		 - Set<> 과 비슷하게 작동하지만, Set<> 과는 다르게 순서가 유지 됨
 */
public class StreamAPIEx4 {

	public static void main(String[] args) {

		List<String> fruits = Arrays.asList("apple", "bananan", "apple", "orange");
		
		List<String> distinctedFruits = fruits.stream()
				.distinct()			// 순서를 유지하며 중복 제거
				.collect(Collectors.toList());
		
		System.out.println(distinctedFruits);
	}
}
