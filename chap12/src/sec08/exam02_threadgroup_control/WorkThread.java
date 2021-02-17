package sec08.exam02_threadgroup_control;

public class WorkThread extends Thread{
	
		public WorkThread(ThreadGroup threadGroup, String threadName ) {
				super(threadGroup, threadName);
		}
		
		
		@Override
		public void run() {
				while(true) {
					try {
							Thread.sleep(1000);
					} catch (InterruptedException e) {
						// 나중에 interrupt시키려고
							System.out.println(getName() + " is interrupted");
							break;
					}
					
				}
				
				System.out.println(getName()+" is terminated");
		}

}
