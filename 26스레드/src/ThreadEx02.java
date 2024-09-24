
/**
 * 스레드 예제
 */
public class ThreadEx02 extends Thread {

	public ThreadEx02(String name) {
		super(name);
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
			System.out.println(getName() + " : " + sum);
		}
	}

	public static void main(String[] args) {

		ThreadEx02 t1 = new ThreadEx02("First Thread");
		ThreadEx02 t2 = new ThreadEx02("Second Thread");
		
		t1.start();
		t2.start();
	}

}
