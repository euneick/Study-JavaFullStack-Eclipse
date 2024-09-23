import java.util.Enumeration;
import java.util.Hashtable;

/**
 * HashTable 예제
 * 
 * HashTableTest.java 예제에서 제네릭타입 지정
 */
public class HashTableTest2 {

	public static void main(String[] args) {

		Hashtable<String, String> hashTable = new Hashtable<String, String>();

		hashTable.put("사과", "Apple");
		hashTable.put("딸기", "Strawberry");
		hashTable.put("포도", "Grapes");

		System.out.println("key 사과 의 value : " + hashTable.get("사과"));
		System.out.println("key Strawberry 의 value : " + hashTable.get("Strawberry"));
		System.out.println("key 포도 의 value : " + hashTable.get("포도"));

		System.out.println();

		Enumeration<String> enumeration = hashTable.keys();

		while (enumeration.hasMoreElements()) {

			String key = enumeration.nextElement();
			String value = hashTable.get(key);

			System.out.printf("key : %s \t value : %s\n", key, value);
		}
	}

}
