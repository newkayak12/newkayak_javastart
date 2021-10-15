package threadState.state;

public class TargetThread extends Thread{
	public void run(){
		for(long i = 0; i<1000000000; i++){
			int a = 1+2;
		}


		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for(long i = 0; i<1000000000; i++){
			int a = 1+2;
		}
	}
	
}
