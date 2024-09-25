
/**
 * interrupt() 메소드를 이용하여 작업중인 스레드 중지시키는 예제
 */
class StopThreadDemo2 implements Runnable {

	@Override
	public void run() {

		try {
			while (!Thread.currentThread().isInterrupted()) {

				System.out.println("ThreadDemo2 스레드 작업 중..");
				Thread.sleep(500);
			}
		}
		catch (InterruptedException e) {
			System.out.println("interrupt() 메소드에 의해 ThreadDemo2 스레드 작업 중지");
		}
		finally {
			System.out.println("ThreadDemo2 스레드 작업 종료");
		}
	}
}

public class StopThreadEx02 {

	public static void main(String[] args) {

		StopThreadDemo2 stopThread = new StopThreadDemo2();
		Thread thread = new Thread(stopThread);
		
		thread.start();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		thread.interrupt();
	}
}
