
/**
 * 2차원 배열에 초기값을 지정한 후 행 단위와 열 단위로 합을 구하는 프로그램
 */
public class Arr04 {

	public static void main(String[] args) {

		int[][] score = { { 85, 60, 70 }, { 90, 95, 80 }, { 75, 80, 100 }, { 80, 70, 95 }, { 100, 65, 80 } };

		int[] studentTotal = new int[score.length];
		int[] subjectTotal = new int[score[0].length];

		System.out.println("\t국어\t영어\t수학\t학생별총점\t학생별평균");
		for (int row = 0; row < score.length; row++) {
			System.out.printf("%d번 학생\t", row + 1);
			for (int col = 0; col < score[row].length; col++) {
				studentTotal[row] += score[row][col];
				subjectTotal[col] += score[row][col];

				System.out.printf("%5d\t", score[row][col]);
			}
			System.out.printf("%5d\t%5.2f\n", studentTotal[row], (float) studentTotal[row] / score[row].length);
		}

		System.out.print("과목별총점\t");
		for (int i = 0; i < subjectTotal.length; i++) {
			System.out.printf("%5d\t", subjectTotal[i]);
		}

		System.out.print("\n과목별평균\t");
		for (int i = 0; i < subjectTotal.length; i++) {
			System.out.printf("%5.2f\t", (float) subjectTotal[i] / score.length);
		}
	}

}
