
/**
 * 생성자 오버로딩 예제
 */
class Example {

	public Example() {
	}

	public Example(int a) {
	}

	public Example(int a, int b) {
	}

	public Example(float a) {
	}

	public Example(float a, float b) {
	}

	public Example(int a, float b) {
	}

	public Example(float a, int b) {
	}
}

class Person {

	String name;
	int age;
	String address;

	public Person() {

		name = "이름없음";
		age = 0;
		address = "주소없음";
	}

	public Person(String name) {

		this.name = name;
		age = 0;
		address = "주소없음";
	}

	public Person(String name, int age) {

		this.name = name;
		this.age = age;
		address = "주소없음";
	}

	public Person(String name, int age, String address) {

		this.name = name;
		this.age = age;
		this.address = address;
	}

	public void printInfo() {

		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
	}
}

public class Ex2 {

	public static void main(String[] args) {

		Person person1 = new Person();
		person1.printInfo();

		System.out.println();

		new Person("홍길동").printInfo(); // 인스턴스 변수

		System.out.println();

		Person person2 = new Person("홍길동", 25);
		person2.printInfo();

		System.out.println();

		Person person3 = new Person("홍길동", 25, "서울");
		person3.printInfo();
	}

}
