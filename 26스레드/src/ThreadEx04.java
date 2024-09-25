
/**
 * Runnable 인터페이스 예제
 */
class _ThreadDemo implements Runnable {

	private Thread thread;
	
	public _ThreadDemo(String name) {

		thread = new Thread(this, name);
		thread.start();
	}

	@Override
	public void run() {

		System.out.println(thread.getName() + "스레드 작업 시작");
		
		for (int i = 0; i < 10; i++) {

			System.out.println(thread.getName() + " : " + i);
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(thread.getName() + "스레드 작업 종료");
	}
}

public class ThreadEx04 {

	public static void main(String[] args) {
		
		System.out.println("메인스레드 작업 시작");
		
		new _ThreadDemo("보조스레드");
		
		for (int i = 0; i < 10; i++) {
			
			System.out.print(".");
			try {
				Thread.sleep(500);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("메인스레드 작업 종료");
	}

}
