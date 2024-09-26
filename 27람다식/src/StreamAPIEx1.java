import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Stream API 예제
 */
public class StreamAPIEx1 {

	public static void main(String[] args) {

		List<Integer> scores = Arrays.asList(65, 70, 80, 90, 85, 50, 40);

//		Stream<Integer> stream = scores.stream();
//		stream = stream.filter(score -> score >= 60);
//		IntStream intStream = stream.mapToInt(score -> score);		
//		System.out.println(intStream.average().orElse(0.0));
		
		System.out.println(
			scores.stream()
			.filter(score -> score >= 60)
			.mapToInt(score -> score)
			.average().orElse(0.0)
		);
	}
}
