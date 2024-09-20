import java.util.Enumeration;
import java.util.Vector;

/**
 * Enumeration 예제
 */
public class EnumerationTest01 {

	public static void main(String[] args) {

		Vector<Object> vector = new Vector<Object>();

		for (int i = 1; i <= 5; i++) {
			vector.add(i * 10);
		}

		Enumeration<Object> enumeration = vector.elements();

		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}

}
