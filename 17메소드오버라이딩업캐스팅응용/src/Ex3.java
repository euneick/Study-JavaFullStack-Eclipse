
/**
 * 오버라이딩된 부모클래스의 메소드 사용하기
 */
class Parent {

	public void printParent() {

		System.out.println("Parent 클래스의 printParent() 실행");
	}
}

class Child extends Parent {

	@Override
	public void printParent() {

		System.out.println("Child 클래스의 printParent() 실행");
		super.printParent();
	}
	
	public void printChild() {
		
		System.out.println("Child 클래스의 printChild() 실행");
	}
}

public class Ex3 {

	public static void main(String[] args) {

		Child child = new Child();
		
		child.printChild();
		child.printParent();
	}
}
