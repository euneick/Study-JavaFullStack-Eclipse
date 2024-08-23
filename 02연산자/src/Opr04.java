
/**
 * 10대인지 아닌지 알아보기(논리 연산자)
 */
public class Opr04 {

	public static void main(String[] args) {

		int age = 29;
		String result = "";
		
		result = age >= 10 && age < 20 ? "10대입니다." : "10대가 아닙니다.";
		System.out.println(result);
	}

}
