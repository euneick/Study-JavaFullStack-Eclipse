
/**
 * Thread 클래스 예제
 */
class ThreadDemo extends Thread {

	public ThreadDemo(String name) {

		setName(name);
		start();
	}

	@Override
	public void run() {

		System.out.println(getName() + "스레드 작업 시작");
		
		for (int i = 0; i < 10; i++) {

			System.out.println(getName() + " : " + i);
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(getName() + "스레드 작업 종료");
	}
}

public class ThreadEx03 {

	public static void main(String[] args) {
		
		System.out.println("메인스레드 작업 시작");
		
		ThreadDemo threadDemo = new ThreadDemo("보조스레드");
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println(".");
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
