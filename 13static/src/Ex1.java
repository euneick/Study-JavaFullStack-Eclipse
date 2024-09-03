
/**
 * static 변수, static 메소드 예제
 */
class Test {
	
	int x;
	static int y;
	
	public Test(int z) {
		
		x += z;
		y += z;
	}
}

public class Ex1 {

	public static void main(String[] args) {

		System.out.println("Test.y : " + Test.y);
		System.out.println();
		
		Test t1 = new Test(10);
		
		System.out.println("t1.x : " + t1.x);
		System.out.println("Test.y : " + Test.y);
		System.out.println();
		
		Test t2 = new Test(5);

		System.out.println("t1.x : " + t1.x);
		System.out.println("t2.x : " + t2.x);
		System.out.println("Test.y : " + Test.y);
	}

}
