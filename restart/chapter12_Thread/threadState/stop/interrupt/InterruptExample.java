package threadState.stop.interrupt;

public class InterruptExample {
	public static void main(String[] args) {
		Thread thread = new PrintThread2();
		thread.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		thread.interrupt();
		//의도적으로 interrupt를 발생시켜서 쓰레드를 정리할 수 있다. 
	}
}
