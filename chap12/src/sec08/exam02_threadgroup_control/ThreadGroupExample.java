package sec08.exam02_threadgroup_control;

public class ThreadGroupExample {

	public static void main(String[] args) {
		
			ThreadGroup myGroup = new ThreadGroup("myGroup");
			
			WorkThread workThreadA = new WorkThread(myGroup, "Work Thread A");
			WorkThread workThreadB = new WorkThread(myGroup, "Work Thread B");
			
				workThreadA.start();
				workThreadB.start();
				
				
				System.out.println("main group's list method");
			ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
			mainGroup.list();
				System.out.println();
				
				try {
						Thread.sleep(3000);
				} catch (InterruptedException e) {
				}
				
				
			myGroup.interrupt(); //이러면 myGroup에 있는 모든 녀석들에 interrupt를 걸어서 thread를 종
			
	}

}
