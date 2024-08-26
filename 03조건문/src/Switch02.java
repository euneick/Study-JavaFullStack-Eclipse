import java.util.Scanner;

/**
 * switch 문을 사용하여 학생 점수를 학점으로 출력하는 예제
 * 입력받은 학생 점수에 따라 A, B, C, D, F 중 하나를 출력
 */
public class Switch02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("학생 점수 입력 : ");
		int score = scanner.nextInt();
		
		if (score < 0 || score > 100) {
			System.out.println("잘못된 점수입니다.\n0에서 100사이의 정수를 입력하세요.");
			return;
		}
		
		String grade;

		switch (score / 10) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
		}
		System.out.println("학생의 학점은 " + grade + " 입니다.");
		
		scanner.close();
	}

}
