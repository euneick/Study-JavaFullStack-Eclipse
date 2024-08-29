
/**
 * 생성된 객체 메모리 주소들을 배열의 각 원소에 저장하여 사용하기
 */

class Person {

	String name;
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class Ex4 {

	public static void main(String[] args) {

		Person[] persons = new Person[10];

		for (int i = 0; i < persons.length; i++) {

			persons[i] = new Person();
			persons[i].setAge(30 + i);

			System.out.printf("persons배열 %d번째 인덱스의 Person 객체 %2d의 객체 변수 age = %d\n", i, (i + 1), persons[i].getAge());
		}
		
		System.out.println("------------------------------------");
		
		int index = 0;
		for(Person person : persons) {
			
			person.setAge(40 + index);
			System.out.printf("persons배열 %d번째 인덱스의 Person 객체 %2d의 객체 변수 age = %d\n", index, (index + 1), person.getAge());
			
			index++;
		}
	}

}
