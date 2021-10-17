package threadName;
public class ThreadNameExamle {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("Name Of Thread : " + mainThread.getName() +" / id : " + mainThread.getId() + " / priority : "+ mainThread.getPriority() + " / state : "+ mainThread.getPriority());

		ThreadA threadA = new ThreadA();
		System.out.println("Name Of ThreadA : " + threadA.getName() +" / id : " + threadA.getId() + " / priority : "+ threadA.getPriority() + " / state : "+ threadA.getPriority());
		threadA.start();

		ThreadB threadB = new ThreadB();
		System.out.println("Name Of ThreadB : " + threadB.getName() +" / id : " + threadB.getId() + " / priority : "+ threadB.getPriority() + " / state : "+ threadB.getPriority());
		threadB.start();
	}
}
