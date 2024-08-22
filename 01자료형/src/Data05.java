
/**
 * 자료형 변환
 */
public class Data05 {

	public static void main(String[] args) {

		// 자동 형 변환
		short s1 = 128;
		int n1 = 32678;

//		b = c;		// 작은 크기의 자료형으로는 자동 형 변환이 일어나지 않음
		n1 = s1;

		System.out.println(n1);

		// 강제 형 변환
		short s2 = 128;
		int n2 = 32678;

		s2 = (short) n2;

		System.out.println(s2);
	}

}
