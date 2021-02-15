package sec05.exam01_state;

public class StatePrintThread extends Thread {
		
//		얘는 target의 상태를 지속적으로 출력해주는 역할을 할 것임
	private Thread targetThread;

	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	
		@Override
		public void run() {
			
				while(true) {
						Thread.State state = targetThread.getState(); //열거 타입 State
					
							System.out.println("target thread status : " + state);

							if(state == Thread.State.NEW) {
								targetThread.start();
							}
							
							if(state == Thread.State.TERMINATED) {
								break;
							}
							
							try {
								Thread.sleep(500);
							} catch (InterruptedException e) {
							}
				}
					
		}
	
	
}
