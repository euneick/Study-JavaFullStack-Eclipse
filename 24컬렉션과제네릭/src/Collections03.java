import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Iterator 예제
 */
public class Collections03 {

	public static void main(String[] args) {

		List<Object> list = new ArrayList<Object>();
		
		list.add("하나");
//		list.add(new Integer(2));
		list.add(Integer.valueOf(2));
//		list.add(new Double(3.42));
		list.add(Double.valueOf(3.42));
		list.add("넷");
		list.add("다섯");
		list.add(6);
		
		Iterator<Object> iter = list.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
