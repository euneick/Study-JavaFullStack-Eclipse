
/**
 * Runnable 인터페이스 예제
 */
public class RunnableEx01 implements Runnable {

	private String name;

	public RunnableEx01(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		
		int sum = 0;

		for (int i = 0; i < 5; i++) {
			
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			sum += i;
			System.out.println(name + " : " + sum);
		}
	}

	public static void main(String[] args) {
		
		RunnableEx01 r1 = new RunnableEx01("First Thread");
		Thread th1 = new Thread(r1);
		
		RunnableEx01 r2 = new RunnableEx01("Second Thread");
		Thread th2 = new Thread(r2);
		
		th1.start();
		th2.start();
	}
}
