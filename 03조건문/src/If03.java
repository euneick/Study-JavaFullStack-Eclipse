
/**
 * if-else 문을 사용하여, 해당 문자가 영문 대문자인지, 소문자인지, 영문자인지 확인하는 프로그램
 */
public class If03 {

	public static void main(String[] args) {
		char ch = 'J';

		if (ch >= 'A' && ch <= 'Z')
			System.out.println(ch + "는 대문자입니다.");
		else if (ch >= 'a' && ch <= 'z')
			System.out.println(ch + "는 소문자입니다.");
		else
			System.out.println(ch + "는 영문자가 아닙니다.");
	}

}
