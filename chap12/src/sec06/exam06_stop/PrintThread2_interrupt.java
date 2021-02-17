package sec06.exam06_stop;

public class PrintThread2_interrupt extends Thread {
	@Override
	public void run() {
//**************** sleep으로 종료 유도	
//		try {
//					while(true) {
//						System.out.println("runtime");
//						Thread.sleep(1);   //아무리 짧은 순간이라도 여기서 interrupt예외 발생
//						
//					}
//			} catch (InterruptedException e) {
//			}
		
		//sleep이 되면 정지
		
		
//	************** Thread.Interrupted(정적메소드 사용)	
		while(true) {
				System.out.println("runtime");
		
				if(Thread.interrupted()) {  //혹은 Thread.interrupted()를 두면 여기서 interrupt()가 예외 발생시켜서 쓰레드 종
//				혹은
//				if(isInterrupted()) {   //이걸로 예외 발생
					
				
					break;
				}
			
		}
		
		
		
		System.out.println("return resource");
		System.out.println("terminated");
			
			
	
	}
}
