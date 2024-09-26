import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Stream API 예제
 * 
 * 		map()
 */
public class StreamAPIEx3 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

		List<Integer> nameLengthes = names.stream()
				.map(String::length) 		// 각 문자 스트림에 있는 문자열의 길이를 구함
				.collect(Collectors.toList());
		
		System.out.println(nameLengthes);
	}
}
