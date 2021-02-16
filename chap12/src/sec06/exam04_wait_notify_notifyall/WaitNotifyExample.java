package sec06.exam04_wait_notify_notifyall;

public class WaitNotifyExample {

	public static void main(String[] args) {
		
		WorkObject sharedObj = new WorkObject();
		
		ThreadA ta = new ThreadA(sharedObj);
		ThreadB tb = new ThreadB(sharedObj);
		
		ta.start();
		
		tb.start();
		
//		아무 것도 안 하면...
//		Thread B의 method B작업 실행
//		Thread B의 method B작업 실행
//		Thread B의 method B작업 실행
//		Thread B의 method B작업 실행
//		Thread B의 method B작업 실행
//		Thread B의 method B작업 실행
//		Thread B의 method B작업 실행
//		Thread B의 method B작업 실행
//		Thread B의 method B작업 실행
//		Thread B의 method B작업 실행
//		Thread A의 method A작업 실행
//		Thread A의 method A작업 실행
//		Thread A의 method A작업 실행
//		Thread A의 method A작업 실행
//		Thread A의 method A작업 실행
//		Thread A의 method A작업 실행
//		Thread A의 method A작업 실행
//		Thread A의 method A작업 실행
//		Thread A의 method A작업 실행
//		Thread A의 method A작업 실행
		
		
		
		
//		WorkObject의 메소드를 synchronized하고 notify, wait을 걸어줌 

		
		
		
	}

}
