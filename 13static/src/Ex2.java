
/**
 * static 메소드 예제
 */
class AAA {

	int num;
	static int staticNum;

	public AAA() {}

	public void add(int value) {

		num += value;
		staticNum += value;
	}
	
	public int getNum() { return num; }
	public void setNum(int n) { num = n; }
	
	public static int getStaticNum() { return staticNum; }
	public static void setStaticNum(int n) { staticNum = n; }
}

public class Ex2 {

	public static void main(String[] args) {
	
		AAA aaa = new AAA();
		
		AAA.staticNum = 50;
//		aaa.staticNum = 50;
		
		System.out.println(AAA.getStaticNum());
//		System.out.println(aaa.getStaticNum());
		
		AAA.setStaticNum(50);
//		aaa.setStaticNum(50);
	}

}
