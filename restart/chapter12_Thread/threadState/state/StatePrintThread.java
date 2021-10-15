package threadState.state;

public class StatePrintThread extends Thread {
	private Thread targeThread;


	public StatePrintThread(Thread targeThread) {
		this.targeThread = targeThread;
	}


	public void run(){
		while(true){
			Thread.State state = targeThread.getState();
			System.out.println("타겟 쓰레드 상태"+state);

			if(state == Thread.State.NEW){
				targeThread.start();
			}
			
			if(state == Thread.State.TERMINATED){
				break;
			}

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}
}

