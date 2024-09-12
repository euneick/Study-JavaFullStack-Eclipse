
/**
 * 두 개 이상의 예외를 하나의 블럭으로 처리하는 예제
 */
package ex1;

public class ExceptionHandlingExample5 {

	public static void main(String[] args) {

		String[] array = { "100", "1oo", null, "200" };
		
		for (int i = 0; i <= array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.printf("array[%d] : %d\n", i, value);
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스가 초과됨 : " + e.getMessage());
			}
			catch (NullPointerException | NumberFormatException e) {
				System.out.println("데이터에 문제가 있음 : " + e.getMessage());
			}
		}
	}

}
