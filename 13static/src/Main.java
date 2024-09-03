
/**
 * static 활용 예제
 */
class Member {

	private static int idCounter = 1;

	private String name;
	private String email;
	private int id;

	public Member(String name, String email) {

		this.name = name;
		this.email = email;
		id = idCounter++;
	}

	public int getId() { return id; }
	public void setId(int n) { id = n; }
	
	public static void reduceIdCounter() { idCounter--; }

	public void displayInfo() {

		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
		System.out.println("Email : " + email);
	}
}

class MemberManager {

	private static Member[] members = new Member[10];
	private static int memberCount = 0;

	public static void addMember(Member member) {

		if (memberCount >= members.length) {
			System.out.println("Can't not add more members. Array is full");
			return;
		}

		members[memberCount++] = member;
	}

	public static Member getMember(int id) {

		for (int i = 0; i < memberCount; i++)
			if (members[i].getId() == id)
				return members[i];

		return null;
	}

	public static void removeMember(int id) {

		int searchIndex = -1;

		for (int i = 0; i < memberCount; i++) {
			if (members[i].getId() == id) {
				searchIndex = i;
				break;
			}
		}

		if (searchIndex == -1) {

			System.out.println("No member found with ID : " + id);
			return;
		}

		for (int i = searchIndex; i < memberCount - 1; i++) {

			members[i] = members[i + 1];
			members[i].setId(members[i].getId() - 1);
		}

		members[--memberCount] = null;
		Member.reduceIdCounter();

		System.out.println("Member with ID : " + id + " removed.");
	}

	public static void displayAllMembers() {
		
		if (memberCount == 0) { // 배열에 회원이 없을 경우
			System.out.println("No members found."); // 회원이 없다는 메시지 출력
		}
		else {
			for (int i = 0; i < memberCount; i++) { // 현재 저장된 회원 수만큼 순회
				members[i].displayInfo(); // 각 회원의 정보를 출력
				System.out.println(); // 회원 정보 사이에 빈 줄 추가
			}
		}
	}
}

public class Main {

	public static void main(String[] args) {

		// 새로운 회원들을 생성
		Member member1 = new Member("John Doe", "john@example.com"); // 첫 번째 회원 생성
		Member member2 = new Member("Jane Doe", "jane@example.com"); // 두 번째 회원 생성
		Member member3 = new Member("Alice Smith", "alice@example.com"); // 세 번째 회원 생성

		// 생성한 회원들을 회원 관리 배열에 추가
		MemberManager.addMember(member1);
		MemberManager.addMember(member2);
		MemberManager.addMember(member3);

		// 모든 회원의 정보를 출력
		System.out.println("All Members:");
		MemberManager.displayAllMembers();

		// 특정 ID로 회원을 검색
		int searchId = 2; // 검색할 회원 ID 설정
		Member searchedMember = MemberManager.getMember(searchId);
		
		if (searchedMember != null) { // 검색된 회원이 있을 경우
			System.out.println("Member Found with ID : " + searchId);
			searchedMember.displayInfo(); // 회원 정보 출력
		} 
		else {
			System.out.println("No member found with ID " + searchId); // 해당 ID의 회원이 없을 경우
		}
		System.out.println();

		// 특정 ID의 회원을 삭제
		int deleteId = 2; // 삭제할 회원 ID 설정
		MemberManager.removeMember(deleteId);

		// 삭제 후 남은 모든 회원의 정보를 다시 출력
		System.out.println("\nAll Members After Deletion:");
		MemberManager.displayAllMembers();
	}

}
