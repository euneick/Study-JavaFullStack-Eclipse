
/**
 * flag 변수를 이용하여 작업중인 스레드 중지시키는 예제
 */
class StopThreadDemo1 implements Runnable {

	private boolean stopped = false;

	@Override
	public void run() {

		while (!stopped) {

			System.out.println("ThreadDemo1 스레드 작업 중..");

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("ThreadDemo1 스레드 작업 중지됨");
	}

	public void stop() {
		stopped = true;
	}
}

public class StopThreadEx01 {

	public static void main(String[] args) {

		StopThreadDemo1 stopThread = new StopThreadDemo1();
		Thread thread = new Thread(stopThread);

		thread.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		stopThread.stop();
	}
}
