import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * LinkedList 예제
 * 
 * List 인터페이스를 구현한 ArrayList와 LinkedList의 차이
 * 		- LinkedList는 이전 노드와 다음 노드를 서로 체인처럼 연결하여 관리
 * 		- 추가 및 삭제에 속도적인 측면에서 유리함
 */
public class LinkedListText {
	
	public static void printList(String listName, List<Integer> list) {
		
		System.out.printf("%s : ", listName);
		for (int i : list)
			System.out.print(i + "  ");
		System.out.println();
	}

	public static void main(String[] args) {

		Queue<Object> queueLinkedList = new LinkedList<Object>();		// Queue 인터페이스를 구현한 LinkedList

		queueLinkedList.offer("1-자바");
		queueLinkedList.offer("2-C++");
		queueLinkedList.offer("3-API");
		queueLinkedList.offer("4-JSP");

		while (queueLinkedList.peek() != null) {		// queue 가 비어있다면 null을 리턴
			System.out.println(queueLinkedList.poll());
		}
		
		System.out.println();

		List<Integer> arrayList = new ArrayList<Integer>();

		for (int i = 1; i <= 3; i++)
			arrayList.add(i * 10);

		printList("ArrayList", arrayList);
		
		System.out.println("1 번째 삭제");
		arrayList.remove(1);

		printList("ArrayList", arrayList);
		
		System.out.println("\n");
		
		List<Integer> linkedList = new LinkedList<Integer>();		// List 인터페이스를 구현한 LinkedList

		for (int i = 4; i <= 6; i++)
			linkedList.add(i * 10);

		printList("LinkedList", linkedList);
		
		System.out.println("1 번째 삭제");
		linkedList.remove(1);

		printList("LinkedList", linkedList);
	}

}
