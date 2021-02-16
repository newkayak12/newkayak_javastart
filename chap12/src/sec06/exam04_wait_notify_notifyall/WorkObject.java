package sec06.exam04_wait_notify_notifyall;

public class WorkObject {
	public  synchronized  void methodA() {
		System.out.println("Thread A의 method A작업 실행");
		
		
		notify();
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public synchronized  void methodB()	{
		System.out.println("Thread B의 method B작업 실행");
		
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
//		Exception in thread "Thread-3" Exception in thread "Thread-2" java.lang.IllegalMonitorStateException
//		at java.base/java.lang.Object.notify(Native Method)
//		at sec06.exam04_wait_notify_notifyall.WorkObject.methodB(WorkObject.java:20)
//		at sec06.exam04_wait_notify_notifyall.ThreadB.run(ThreadB.java:13)
//	java.lang.IllegalMonitorStateException
//		at java.base/java.lang.Object.notify(Native Method)
//		at sec06.exam04_wait_notify_notifyall.WorkObject.methodA(WorkObject.java:8)
//		at sec06.exam04_wait_notify_notifyall.ThreadA.run(ThreadA.java:13)

	}
}
