
/**
 * 여러 매개변수를 가진 메소드
 */
public class Example4 {

	public static void printStudentInfo(String name, int age) {

		System.out.println("이름 : " + name + ", 나이 : " + age);
	}

	public static int add(int n1, int n2) {

		return n1 + n2;
	}

	public static float add(float f1, float f2) {

		return f1 + f2;
	}

	public static void main(String[] args) {

		printStudentInfo("홍길동", 30);
		System.out.println(add(5, 10));
		System.out.println(add(5.5f, 10.5f));
	}

}
