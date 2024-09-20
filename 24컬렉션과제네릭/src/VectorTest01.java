import java.util.Iterator;
import java.util.Vector;

/**
 * Vector 예제
 */
public class VectorTest01 {

	public static void main(String[] args) {

//		Vector<Object> vector = new Vector<Object>(); 		// 기본생성자 호출 시 용량(capacity)의 크기를 10으로 설정 (this.(10) 호출)
//		Vector<Object> vector = new Vector<Object>(4);		// 초기 용량을 4로 설정
		Vector<Object> vector = new Vector<Object>(4, 3); 	// 초기 용량을 4로 설정, 추가로 필요하면 용량을 3씩 증가

		System.out.println("현재 vector의 크기 : " + vector.size());
		System.out.println("현재 vector의 용량 : " + vector.capacity());

		for (int i = 0; i < 5; i++)
			vector.add(i);
		
		System.out.print("현재 vector의 내용 : ");
		Iterator<Object> iter = vector.iterator();
		while (iter.hasNext())
			System.out.print(iter.next() + " ");
		System.out.println();

		System.out.println("현재 vector의 크기 : " + vector.size());
		System.out.println("현재 vector의 용량 : " + vector.capacity());

		vector.trimToSize();			// 용량을 크기에 맞춤

		System.out.println("현재 vector의 크기 : " + vector.size());
		System.out.println("현재 vector의 용량 : " + vector.capacity());

		System.out.println("vector의 첫번째 요소 : " + vector.firstElement());
		System.out.println("vector의 마지막 요소 : " + vector.lastElement());
	}

}
