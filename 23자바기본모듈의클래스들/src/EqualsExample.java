
/**
 * 자바 base 모듈의 Object 클래스 활용 예제
 */
class Member {

	public String id;

	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Member target) {
			if (id.equals(target.id))
				return true;
		}

		return false;
	}
}

public class EqualsExample {

	public static void main(String[] args) {

		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");

		if (obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}

		if (obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 동등합니다.");
		} else {
			System.out.println("obj1과 obj3는 동등하지 않습니다.");
		}
	}

}
