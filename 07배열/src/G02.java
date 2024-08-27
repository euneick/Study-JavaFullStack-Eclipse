
/**
 * 1차원의 배열에 내용을 직접 초기화(저장) 하는 방법으로 배열 메모리를 만드는 방법
 */
public class G02 {

	public static void main(String[] args) {

		int[] month = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		for (int i = 0; i < month.length; i++) {
//			System.out.println((i + 1) + " month => " + month[i]);
			System.out.printf("%2d month => %d\n", (i + 1), month[i]);
		}
	}

}
