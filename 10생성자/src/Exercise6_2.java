
class Student {

	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	public Student(String name, int ban, int no, int kor, int eng, int math) {

		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String info() {

		return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + getTotal() + ", "
				+ getAverage();
	}

	public int getTotal() {
		
		return kor + eng + math;
	}

	public float getAverage() {
		
		return Math.round((kor + eng + math) / 3.0f * 10.0f) / 10.0f;
	}
}

public class Exercise6_2 {

	public static void main(String[] args) {

		Student s = new Student("홍길동", 1, 1, 100, 60, 76);

		String str = s.info();
		System.out.println(str);
	}

}
