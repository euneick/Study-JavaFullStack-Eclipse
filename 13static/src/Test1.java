
/**
 * static 예제
 */
class Student {

	int num;
	static int staticNum;

	public Student() {
	}

	public void add(int n) {

		num += n;
		staticNum += n;
	}
}

public class Test1 {

	public static void main(String[] args) {

		Student a_student = new Student();
		a_student.add(5);

		System.out.println("--참조변수 a_student객체--");
		System.out.println("인스턴스 변수 num = " + a_student.num);
		System.out.println("클래스 변수 staticNum = " + Student.staticNum);
		
		System.out.println();

		Student b_student = new Student();
		b_student.add(5);
		
		System.out.println("--참조변수 b_student객체--");
		System.out.println("인스턴스 변수 num = " + b_student.num);
		System.out.println("클래스 변수 staticNum = " + Student.staticNum);
	}

}
