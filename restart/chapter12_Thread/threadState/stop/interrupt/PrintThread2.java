package threadState.stop.interrupt;

public class PrintThread2 extends Thread{
	
	@Override
	public void run() {
		
		// try{
			// while(true){
			// 	System.out.println("실행 중");
			// 	Thread.sleep(1);
			// } 

			// 혹은
		// }catch(InterruptedException e){

		// }

			while(true){
				System.out.println("실행 중");

				if(Thread.interrupted()){
					//interrupt인지 확인 
					break;
				}
			}

		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
	
}
