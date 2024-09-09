
/**
 * 추상메소드 예제
 */
abstract class Animal {
	
	public void breathe() {
		
		System.out.println("숨 쉬기");
	}
	
	public abstract void sound();
}

class Dog extends Animal {

	@Override
	public void sound() {

		System.out.println("멍멍");
	}
}

public class AbstractMethod {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		
		dog.breathe();
		dog.sound();
	}

}
