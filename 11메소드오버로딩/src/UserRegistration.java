
/**
 * 메소드 오버로딩 활용 예제
 */
public class UserRegistration {

	private String name;
	private String email;
	private int age;
	private String phone;

	public void registerUser(String name, String email) {

		this.name = name;
		this.email = email;
		this.age = 0;
		this.phone = null;

		printInfo();
	}

	public void registerUser(String name, String email, int age) {

		this.name = name;
		this.email = email;
		this.age = age;
		this.phone = null;

		printInfo();
	}

	public void registerUser(String name, String email, int age, String phone) {

		this.name = name;
		this.email = email;
		this.age = age;
		this.phone = phone;

		printInfo();
	}

	public void printInfo() {

		System.out.println("사용자 정보");
		System.out.println("이름 : " + name);
		System.out.println("이메일 : " + email);
		if (age != 0)
			System.out.println("나이 : " + age);
		if (phone != null)
			System.out.println("전화번호 : " + phone);
		System.out.println();
	}

	public static void main(String[] args) {

		UserRegistration registration = new UserRegistration();

		registration.registerUser("홍길동", "hong@example.com");
		registration.registerUser("김철수", "kim@example.com", 25);
		registration.registerUser("이영희", "lee@example.com", 30, "010-1234-5678");
	}

}
