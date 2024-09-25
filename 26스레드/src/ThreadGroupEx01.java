
/**
 * 스레드 그룹 예제
 */
public class ThreadGroupEx01 {

	public static void main(String[] args) {

		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();

		ThreadGroup group1 = new ThreadGroup("Thread Group 1");
		ThreadGroup group2 = new ThreadGroup("Thread Group 2");

		ThreadGroup subGroup1 = new ThreadGroup(group1, "Sub Thread Group 1");

		group1.setMaxPriority(3); 		// 우선순위 3으로 설정 (최고 10, 최소 1, 기본 5)

		Thread thread1 = new Thread(group1, "main - group1 - thread1");
		Thread thread2 = new Thread(subGroup1, "main - group1 - subGroup1 - thread2");
		Thread thread3 = new Thread(group2, "main - group2 - thread3");
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		System.out.print(">> List of ThreadGroup : " + mainGroup.getName());		
		System.out.println("\t Activity ThreadGroup : " + mainGroup.activeGroupCount());
		mainGroup.list();		// 연결된 스레드그룹 을 모두 출력 (디버그 용)
	}

}
