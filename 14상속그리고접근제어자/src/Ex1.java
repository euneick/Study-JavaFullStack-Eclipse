
/**
 * 클래스 상속 예제
 */
class Parent {
	
	public Parent() {
		
		System.out.println("Parent 생성자 호출");
	}
	
	public void printParent() {
		
		System.out.println("Parent 클래스 호출");
	}
}

class Child extends Parent {
	
	public Child() {
		
		System.out.println("Child 생성자 호출");
	}
	
	public void printChild() {
		
		System.out.println("Child 클래스 호출");
	}
}

public class Ex1 {

	public static void main(String[] args) {
		
		Child child = new Child();
		
		child.printChild();
		child.printParent();
		
		System.out.println();
		
		Parent parent = new Parent();
		
		parent.printParent();
//		parent.printChild();
	}

}
