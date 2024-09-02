
/**
 * 메소드 오버로딩 활용 예제
 */
public class ArrayUtils {

	public int sum(int[] array) {
		int sum = 0;
		for (int value : array)
			sum += value;
		return sum;
	}

	public double sum(double[] array) {
		double sum = 0f;
		for (double value : array)
			sum += value;
		return sum;
	}

	public void printSum(int[] array) {
		System.out.println("정수 배열의 합 : " + sum(array));
	}

	public void printSum(double[] array) {
		System.out.println("실수 배열의 합 : " + sum(array));
	}

	public static void main(String[] args) {

		ArrayUtils utils = new ArrayUtils();

		int[] intArray = { 1, 2, 3, 4, 5 };
		double[] doubleArray = { 1.5f, 2.5f, 3.5f };

		utils.printSum(intArray);
		utils.printSum(doubleArray);
	}

}
