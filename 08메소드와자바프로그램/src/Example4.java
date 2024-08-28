
/**
 * 여러 매개변수를 가진 메소드
 */
public class Example4 {

	public static void printStudentInfo(String name, int age) {

		System.out.println("이름 : " + name + ", 나이 : " + age);
	}

	public static void main(String[] args) {

		printStudentInfo("홍길동", 30);
	}

}
