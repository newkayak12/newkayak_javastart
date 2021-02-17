package sec06.exam06_stop;

public class InterruptedExample {

	public static void main(String[] args) {
		
		PrintThread2_interrupt pt = new PrintThread2_interrupt();
		
		pt.start();
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		pt.interrupt(); //일시 정지 상태에서 예외가 발생  > 일시 정지가 안되면 의미가 없음
		
	}

}
