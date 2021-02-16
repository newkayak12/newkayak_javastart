package sec06.exam02_yield;

public class YieldExample {

	public static void main(String[] args) {
		
//		Yield는 무의미한 반복을 하지 않고 다른 쓰레드로 작업을 넘길 떄 사용
			ThreadA threadA = new ThreadA();
			ThreadB threadB = new ThreadB();
			
			threadA.start();
			threadB.start();
			
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
				}
			
			threadA.work = false;
//			메인쓰레드가 3초간 쉬는 건데...
			
			
			
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}
		
		threadA.work = true;
		
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
	
	threadA.stop = true;
	threadB.stop = true;
	}

}
