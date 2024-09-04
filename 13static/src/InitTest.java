
/**
 * 각 변수들의 초기화 예제
 */
public class InitTest {

	static int[] arr = new int[10];

	static {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
		}
	}

	int x;
	int y = x; 		// 멤버 변수는 0이 자동으로 초기화 됨

	public void function() {

		int i;
//		int j = i;		// 지역 변수는 자동으로 초기화 되지 않음
	}

	public static void main(String[] args) {

		for (int i = 0; i < arr.length; i++) {
			
			System.out.printf("arr[%d] : %d\n", i, arr[i]);
		}
	}

}
