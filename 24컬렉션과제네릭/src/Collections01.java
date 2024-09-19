import java.util.HashSet;
import java.util.Set;

/**
 * HashSet 예제
 * 
 * 순서가 없고 중복을 허용하지 않음
 */
public class Collections01 {

	public static void main(String[] args) {

		Set set = new HashSet();
		
		set.add("하나");
		set.add(2);		// 자동 박싱
		set.add(3.14);
		set.add("넷");
		set.add("5");
		set.add("5");
		
		System.out.println("크기 : " + set.size());
		System.out.println(set.toString());
	}

}
