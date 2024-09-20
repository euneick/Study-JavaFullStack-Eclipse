import java.util.Stack;

/**
 * Stack 예제
 */
public class StackTest01 {

	public static void main(String[] args) {

		Stack<Object> stack = new Stack<Object>();

		stack.push("1-자바");
		stack.push("2-자바스크립트");
		stack.push("3-API");
		stack.push("4-데이터베이스");

		while (!stack.empty()) {
			System.out.println(stack.pop());
		}
	}

}
