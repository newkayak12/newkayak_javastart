package threadState.cowork.notify;

public class WorkObject {
	public synchronized void methodA(){
		System.out.println("Thread A의 MethodA 작업 실행");

		notify();

		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public synchronized void methodB(){
		System.out.println("Thread B의 MethodB 작업 실행");

		notify();

		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
