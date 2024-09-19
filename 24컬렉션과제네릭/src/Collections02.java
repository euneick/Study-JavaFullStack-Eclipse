import java.util.ArrayList;
import java.util.List;

/**
 * List 인터페이스 예제
 * 
 * 순서가 있고 중복을 허용함
 */
public class Collections02 {

	public static void main(String[] args) {

//		List<Object> list = new ArrayList<Object>();
		List list = new ArrayList();
		
		list.add("하나");
		list.add(2);
		list.add(3.14);
		list.add(4);
		list.add(4);
		
		System.out.println("크기 : " + list.size());
		System.out.println(list.toString());
	}

}
