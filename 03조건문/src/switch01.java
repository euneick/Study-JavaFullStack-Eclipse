
/**
 * switch문을 사용하여, 해당 문자가 소문자 모음인지 확인하는 예제
 */
public class switch01 {

	public static void main(String[] args) {

		char ch = 'i';

		switch (ch) {
		case 'a':
			System.out.println("해당 문자는 'a'입니다.");
			break;
		case 'e':
			System.out.println("해당 문자는 'e'입니다.");
			break;
		case 'i':
			System.out.println("해당 문자는 'i'입니다.");
			break;
		case 'o':
			System.out.println("해당 문자는 'o'입니다.");
			break;
		case 'u':
			System.out.println("해당 문자는 'u'입니다.");
			break;
		default:
			System.out.println("해당 문자는 소문자 모음이 아닙니다.");
		}
	}

}
