import java.util.Enumeration;
import java.util.Hashtable;

/**
 * HashTable 예제
 */
public class HashTableTest {

	public static void main(String[] args) {

		Hashtable<Object, Object> hashTable = new Hashtable<Object, Object>();

		hashTable.put("사과", "Apple");
		hashTable.put("딸기", "Strawberry");
		hashTable.put("포도", "Grapes");

		System.out.println("key 사과 의 value : " + hashTable.get("사과"));
		System.out.println("key Strawberry 의 value : " + hashTable.get("Strawberry"));
		System.out.println("key 포도 의 value : " + hashTable.get("포도"));
		
		System.out.println();

		Enumeration<Object> enumeration = hashTable.keys();

		while (enumeration.hasMoreElements()) {

			String key = (String) enumeration.nextElement();
			String value = (String) hashTable.get(key);

			System.out.printf("key : %s \t value : %s\n", key, value);
		}
	}

}
