
/**
 * 2차원 배열을 선언한 후, 배열의 요소에 값을 대입하고, 요소의 내용을 얻어 출력하는 프로그램
 */
public class Arr03 {

	public static void main(String[] args) {

		int[][] score = { { 85, 60, 70 }, { 90, 95, 80 }, { 75, 80, 100 }, { 80, 70, 95 }, { 100, 65, 80 } };

		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.printf("score[%d][%d] : %3d\t", row, col, score[row][col]);
			}
			System.out.println();
		}
	}

}
