package threadState.stop.flag;

public class StopFlagExample {
	public static void main(String[] args) {
		PrintThread1 printThread1 = new PrintThread1();
		printThread1.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		printThread1.setStop(true);
		//플래그로 정리할 수 있다. 
	}
}
