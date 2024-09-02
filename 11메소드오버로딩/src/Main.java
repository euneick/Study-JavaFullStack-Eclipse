
/**
 * 메소드 오버로드 예제
 */
class Calculator {
	
	public int add(int a, int b) { return a + b; }
	public int add(int a, int b, int c) { return a + b + c; }
	
	public float add(float a, float b) { return a + b; }
	public float add(int a, float b) { return a + b; }
}

public class Main {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		System.out.println(calculator.add(5, 10));
		System.out.println(calculator.add(5, 10, 15));
		System.out.println(calculator.add(5.5f, 10.5f));
		System.out.println(calculator.add(5, 10.5f));
	}

}
