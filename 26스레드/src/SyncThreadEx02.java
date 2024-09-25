import java.util.Stack;

/**
 * 스레드 동기화 예제 - wait(), notify()
 */
class AutoMachine {

	private Stack<Object> store = new Stack<Object>();

	public synchronized String getDrink() {

		try {
			wait(); // notify() 메소드가 호출 될 때까지 대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return store.pop().toString();
	}

	public synchronized void putDrink(String drink) {

		notify(); // wait() 메소드를 호출하여 대기중인 객체를 다시 시작

		store.push(drink);
	}
}

class Productor implements Runnable {

	private AutoMachine machine;

	public Productor(AutoMachine machine) {
		this.machine = machine;
	}

	@Override
	public void run() {

		for (int i = 1; i < 10; i++) {

			System.out.println(Thread.currentThread().getName() + " : 음료수 No." + i + "를 공급 함");

			machine.putDrink("음료수 No." + i);

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Consumer implements Runnable {

	private AutoMachine machine;

	public Consumer(AutoMachine machine) {
		this.machine = machine;
	}

	@Override
	public void run() {

		for (int i = 1; i < 10; i++) {

			System.out.println(Thread.currentThread().getName() + " : " + machine.getDrink());

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class SyncThreadEx02 {

	public static void main(String[] args) {

		AutoMachine machine = new AutoMachine();

		new Thread(new Productor(machine), "공급자").start();

		new Thread(new Consumer(machine), "소비자").start();
	}

}
