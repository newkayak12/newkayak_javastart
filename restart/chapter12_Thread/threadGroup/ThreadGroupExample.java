package threadGroup;

public class ThreadGroupExample {
	public static void main(String[] args) {
		ThreadGroup myGroup = new ThreadGroup("myGroup");
		WorkThread threadA = new WorkThread(myGroup, "workThreadA");
		WorkThread threadB = new WorkThread(myGroup, "workThreadB");

		threadA.start();
		threadB.start();

				System.out.println("[ main Thread 그룹의 list() 메소드 출력 내용 ]");
		
		ThreadGroup main = Thread.currentThread().getThreadGroup();
			main.list();
		
				System.out.println();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
				System.out.println("[ main Thread interrupt 호출 ]");
		myGroup.interrupt();

	}
}
