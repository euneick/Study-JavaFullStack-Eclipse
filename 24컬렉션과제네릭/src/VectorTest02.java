import java.util.Enumeration;
import java.util.Vector;

/**
 * Vector 검색 및 삭제 예제
 */
public class VectorTest02 {

	public static void main(String[] args) {

		Vector<Object> vector = new Vector<Object>();

		double[] doubleArray = { 38.6, 9.2, 45.3, 6.1, 4.7, 1.6 };

		for (int i = 0; i < doubleArray.length; i++)
			vector.add(doubleArray[i]);

		System.out.print("현재 vector의 내용 : ");
		for (int i = 0; i < vector.size(); i++)
			System.out.print(vector.get(i) + "  ");
		System.out.println();

		double searchData = 6.1;
		int searchIndex = vector.indexOf(searchData);		// 찾지 못하면 -1을 리턴
		System.out.println("찾는 데이터 " + searchData + "은(는) " +
			(searchIndex == -1 ? "존재하지 않습니다." : searchIndex + "번째에 있습니다."));

		double deleteData = 45.3;
		System.out.println(deleteData + (vector.remove(deleteData) ? " 삭제 완료" : "이(가) 존재하지 않습니다."));

		Enumeration<Object> enumeration = vector.elements();
		System.out.print("현재 vector의 내용 : ");
		while (enumeration.hasMoreElements())
			System.out.print(enumeration.nextElement() + "  ");
		System.out.println();
	}

}
