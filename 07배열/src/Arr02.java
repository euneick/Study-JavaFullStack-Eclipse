
/**
 * 5개의 실수값 중에서 최대 값을 구하기
 */
public class Arr02 {

	public static void main(String[] args) {

		double[] data = { 9.5, 7.0, 13.6, 7.5, 10.0 };
		double max = data[0];

		for (int i = 1; i < data.length; i++) {
			if (data[i] > max)
				max = data[i];
		}

		System.out.println("MAX = " + max);
	}

}
