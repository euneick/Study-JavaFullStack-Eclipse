
/**
 * Runnable 인터페이스 예제 - 생성자에서 바로 스레드 생성 및 시작
 */
public class RunnableEx02 implements Runnable {

	private Thread thread;

	public RunnableEx02(String name) {
		
		thread = new Thread(this, name);
		thread.start();
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
			System.out.println(thread.getName() + " : " + sum);
		}
	}

	public static void main(String[] args) {
		
		RunnableEx02 r1 = new RunnableEx02("First Thread");		
		RunnableEx02 r2 = new RunnableEx02("Second Thread");
		
	}
}
