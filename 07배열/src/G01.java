
/**
 * 1차원의 배열에 값 저장과 출력 방법
 */
public class G01 {

	public static void main(String[] args) {

		int[] score = new int[5];

		score[0] = 95;
		score[1] = 70;
		score[2] = 80;
		score[3] = 75;
		score[4] = 100;

//		System.out.println(score[0]);
//		System.out.println(score[1]);
//		System.out.println(score[2]);
//		System.out.println(score[3]);
//		System.out.println(score[4]);

		for (int i = 0; i < score.length; i++)
			System.out.println(score[i]);
	}

}
