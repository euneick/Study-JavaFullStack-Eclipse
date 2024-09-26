import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Stream API 예제
 * 
 * 		sorted()
 * 		 - 스트림 내의 요소(객체)들을 오름차순 또는 지정된 Comparator 인터페이스에 따라 정렬
 * 		 - 정렬 기준을 변경하려면 Comparator 인터페이스의 구현객체를 전달하면 됨
 */
public class StreamAPIEx5 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(3, 5, 1, 4, 2);
		
		List<Integer> sortedNumbers = numbers.stream()
				.sorted()		// 기본적으로 오름차순 정렬
				.collect(Collectors.toList());
		
		System.out.println(sortedNumbers);
		
		sortedNumbers = numbers.stream()
				.sorted(Comparator.reverseOrder())		// 내림차순 정렬
				.collect(Collectors.toList());
		
		System.out.println(sortedNumbers);
	}
}
