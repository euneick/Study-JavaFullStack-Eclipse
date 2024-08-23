
/**
 * 변수에 저장된 데이터가 대문자인지 아닌지를 판단하기(논리 연산자)
 */
public class Opr06 {

	public static void main(String[] args) {

		char ch = 'A';
		String result;
		
		result = ch >= 65 && ch <= 90 ? "대문자 입니다." : "대문자가 아닙니다.";
		System.out.println(result);
	}

}
