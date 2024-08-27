
/**
 * 5명의 학생의 점수를 초기값으로 갖는 배열을 선언한 후 점수의 총합을 구하고 평균을 구하는 예제
 */
public class Arr01 {

	public static void main(String[] args) {

		int[] score = { 95, 70, 80, 75, 100 };
		int total = 0;
		float avg = 0f;

		for (int i = 0; i < score.length; i++) {
			total += score[i];
		}
		avg = (float)total / score.length;
		
		System.out.println("Total = " + total);
		System.out.println("AVG = " + avg);
	}

}
