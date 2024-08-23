
/**
 * 비트 논리 연산자
 */
public class BitLogicExample {

	public static void main(String[] args) {

		// 45 - 00101101 (2) 		25 - 00011001 (2)
		System.out.println("45 & 25 = " + (45 & 25));
		System.out.println("45 | 25 = " + (45 | 25));
		System.out.println("~45 = " + (~45));
		System.out.println("45 ^ 25 = " + (45 ^ 25));

		byte receiveData = -120;
		System.out.println("receiveData & 255 = " + (receiveData & 255));
		System.out.println("Byte.toUnsignedInt(receiveData) = " + Byte.toUnsignedInt(receiveData));
	}

}
