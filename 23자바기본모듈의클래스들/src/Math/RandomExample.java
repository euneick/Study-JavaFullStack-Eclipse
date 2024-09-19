
/**
 * 난수 생성 Random 클래스 예제
 */
package Math;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {

		int[] selectNumber = new int[6];
		Random random = new Random(3);		// 난수 생성 시드 3
		System.out.print("선택번호 : ");
		for (int i = 0; i < 6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();

		int[] winningNumber = new int[6];
		random = new Random(5);				// 난수 생성 시드 5
		System.out.print("당첨번호 : ");
		for (int i = 0; i < 6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();

		Arrays.sort(selectNumber);		// 배열 정렬
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber);		// 배열 요소 비교
		System.out.print("당첨여부 : ");
		System.out.println(result ? "1등에 당첨되셨습니다." : "당첨되지 않았습니다.");
	}

}
