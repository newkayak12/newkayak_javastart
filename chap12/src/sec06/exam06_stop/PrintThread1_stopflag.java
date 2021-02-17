package sec06.exam06_stop;

public class PrintThread1_stopflag extends Thread {
	private boolean stop; //기본적으로  false;

	public void setStop(boolean stop) {
		this.stop = stop;
	}
//	stop flag
	@Override
	public void run() {
		while(!stop) {
			System.out.println("실행 중");
			
		}
		
		System.out.println("자원 정리"); //자원 정리 코드를 넣어야한다.
		System.out.println("실행 종료");
	
	}
}
