
/**
 * 메소드 오버로드 예제
 */
public class Printer {

	public void print(String str) { System.out.println("문자열 출력 : " + str); }
	public void print(int n) { System.out.println("정수 출력 : " + n); }
	public void print(float f) { System.out.println("실수 출력 : " + f); }
	public void print(String str, int n) { System.out.println("문자열과 정수 출력 : " + str + ", " + n); }
	
	public static void main(String[] args) {
		
		Printer printer = new Printer();
		
		printer.print("Hello, World!");
		printer.print(100);
		printer.print(99.99f);
		printer.print("점수", 85);
	}

}
