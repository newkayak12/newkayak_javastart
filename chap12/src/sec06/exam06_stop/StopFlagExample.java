package sec06.exam06_stop;

public class StopFlagExample {

	public static void main(String[] args) {
		
		PrintThread1_stopflag pt = new PrintThread1_stopflag();
		
		pt.start();
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//main에 지연을 주고 1초 후 stop flag바꿔 줌
		pt.setStop(true);
		
		//일시 정지 상태의 쓰레드는 종료가 안 됨.
		
		
	}

}
