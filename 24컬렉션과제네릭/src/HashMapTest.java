/*

	HashMap 클래스 
	
	- Map인터페이스의 자식클래스로 
	  key-value한쌍의 형태로 묶어서 저장하는 배열을 만들때
	  사용하는 클래스 
	  
	- 여기서 key와 value는 모두 객체로 저장된다.
	
	- key는 중복저장할수 없지만  value는 중복 저장할수 있다.
	
	- 기존에 저장된 key와 동일한 key로 값을 저장하면 
	  기존에 값은 없어지고 새로운 값으로 대치된다.

	
	메소드 							설명
	V	put(K key, V value)			주어진 키와 값을 추가, 저장이 되면 값을 리턴 (객체 추가)
	
	
	boolean  containsKey(Object key)  주어진 키가 있는여부  true 또는 false리턴
	
	boolean  containsValue(Object value) 주어진 값이 있는여부 true 또는 false리턴 
	
	V   get(Object key)				주어진 키의 값을 리턴 
	
	boolean		isEmpty()			HashMap배열에 데이터가 비어있는지 물어보는 메소드로 
									비어 있으면? true리턴  저장되어있으면 false리턴
									
	Set<K>	keySet()				HashMap배열에 저장된 모든 key객체들을 꺼내서
									Set부모인터페이스를 구현한 자식배열HashSet에 담아 리턴 
	
	int  size()						HashMap배열에 저장된 key의 총개수를 리턴
	
	Collection<V>	values()		HashMap배열에 저장된 모든 value객체들을 꺼내어서
									Collection부모인터페이스를 구현한 자식배열에 담아
									자식배열 자체를 리턴 
	
	void   clear()					HashMap배열에 저장된 모든 데이터 삭제
	
	V	   remove(Object key)	    주어진 key와 일치하는 key-value한쌍의 데이터 삭제
									삭제되면 삭제된 value를 리턴
	
	Set<Map.Entry<K,V>>   entrySet()   
	
	  								키와 값의 쌍으로 구성된 모든 Map.Entry객체를 
	  								Set인터페이스를 구현한 자식 HashSet에 담아 리턴 
	
	
*/

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		// 데이터(key-value)를 한쌍의 형태로 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);

		System.out.println("총 키수 : " + map.size());

		System.out.println();

		String key = "홍길동";

		int value = map.get(key);

		System.out.println(key + ": " + value);

		System.out.println();

		Set<String> keySet = map.keySet();

		Iterator<String> keyIterator = keySet.iterator();

		while (keyIterator.hasNext()) {

			String k = keyIterator.next();
			Integer v = map.get(k);

			System.out.println(k + " : " + v);
		}

		System.out.println();

		Set<Entry<String, Integer>> entrySet = map.entrySet();

		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();

		while (entryIterator.hasNext()) {

			Entry<String, Integer> entry = entryIterator.next();

			String k = entry.getKey();
			Integer v = entry.getValue();

			System.out.println(k + " : " + v);
		}

		System.out.println();

		map.remove("홍길동");

		System.out.println(map);

		System.out.println(map.size());
	}

}
