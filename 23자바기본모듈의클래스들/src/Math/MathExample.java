
/**
 * 수학 관련 메소드를 제공하는 Math 클래스
 */
package Math;

public class MathExample {

	public static void main(String[] args) {

		double v1 = Math.ceil(5.3);
		double v2 = Math.floor(5.3);
		System.out.println("v1 = " + v1);
		System.out.println("v2 = " + v2);

		int v3 = Math.max(3, 7);
		int v4 = Math.min(3, 7);
		System.out.println("v3 = " + v3);
		System.out.println("v4 = " + v4);

		double value = 12.3456;
		double temp1 = value * 100;
		long temp2 = Math.round(temp1);
		double v5 = temp2 / 100.0;
		System.out.println("v5 = " + v5);

		int v6 = Math.abs(-5);
		double v7 = Math.abs(-3.14);
		System.out.println("v6 = " + v6);
		System.out.println("v7 = " + v7);

		double v8 = Math.random();
		System.out.println("v8 = " + v8);
		for (int i = 0; i < 10; i++) {
			// (int)(Math.random() * (최대값 - 최소값 + 1)) + 최소값
			System.out.printf("random %d = %d\n", i, (int) (Math.random() * (15 - 4 + 1)) + 4);
		}
		
		double v9 = Math.pow(2, 4);
		System.out.println("v9 = " + v9);
		
		double pi = Math.PI;
		System.out.println("pi = " + pi);
	}

}
