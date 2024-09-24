
/**
 * 스레드 예제
 */
public class ThreadEx01 extends Thread {

	String name;

	public ThreadEx01(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		int sum = 0;

		for (int i = 0; i < 5; i++) {
			sum += i;
			System.out.println(name + " : " + sum);
		}
	}

	public static void main(String[] args) {

		ThreadEx01 t1 = new ThreadEx01("First Thread");
		ThreadEx01 t2 = new ThreadEx01("Second Thread");
		
		/*
		 * start() 메소드에서 직접 run() 메소드를 실행하는 것이 아닌JVM에게 각각 run() 메소드를 실행하라고 넘김
		 * JVM은 전달받은 run() 메소드 들을 CPU점유에 따라 각각 번갈아가면서 순차적으로 실행
		 */
		t1.start();
		t2.start();
	}

}
