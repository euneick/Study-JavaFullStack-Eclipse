import java.util.ArrayList;

/**
 * ArrayList 예제
 */
public class Collections04 {

	public static void main(String[] args) {

		ArrayList<Object> list = new ArrayList<Object>();

		list.add("하나");
//		list.add(new Integer(2));
		list.add(Integer.valueOf(2));
//		list.add(new Double(3.42));
		list.add(Double.valueOf(3.42));
		list.add("넷");
		list.add(5);
		list.add(5);

		for (Object data : list) {
			System.out.println(data);
		}
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		} 
	}

}
