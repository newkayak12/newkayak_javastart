package sec09.exam01_execute_submit;

import java.util.concurrent.*;

public class ExecuteVsSubmitExample {
		public static void main(String[] args)  throws InterruptedException{
			ExecutorService executorService = Executors.newFixedThreadPool(2);
		
			
			for( int i=0; i<=10; i++) {
				
					Runnable runnable = new Runnable() {
//			익명 구현 객체로 만들어냄
						
						@Override
						public void run() {
							
							ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor)  executorService;
							int poolSize = threadPoolExecutor.getPoolSize();
							String threadName = Thread.currentThread().getName();	
							
							
								System.out.println("총 스레드의 수 : " + poolSize);
								System.out.println("작업 처리 :  " + threadName);
								
								
								
//								예외를 발생시키면 어떻게 될까??
								int value = Integer.parseInt("삼");
//								numberformatException 예상한다.
								
								
//								총 스레드의 수 : 2
//								작업 처리 :  pool-1-thread-1
//								총 스레드의 수 : 2
//								작업 처리 :  pool-1-thread-2
//								총 스레드의 수 : 2
//								작업 처리 :  pool-1-thread-3
//								총 스레드의 수 : 2
//								작업 처리 :  pool-1-thread-4
//								총 스레드의 수 : 2
//								작업 처리 :  pool-1-thread-5
//								총 스레드의 수 : 2
//								작업 처리 :  pool-1-thread-7
//								총 스레드의 수 : 2
//								작업 처리 :  pool-1-thread-6
//								총 스레드의 수 : 2
//								작업 처리 :  pool-1-thread-8
//								총 스레드의 수 : 2
//								작업 처리 :  pool-1-thread-9
//								총 스레드의 수 : 2
//								작업 처리 :  pool-1-thread-11
//								총 스레드의 수 : 2
//								작업 처리 :  pool-1-thread-12
//								Exception in thread "pool-1-thread-8" Exception in thread "pool-1-thread-5" java.lang.NumberFormatException: For input string: "삼"Exception in thread "pool-1-thread-9" 
//								java.lang.NumberFormatException: For input string: "삼"
//								Exception in thread "pool-1-thread-4" java.lang.NumberFormatException: For input string: "삼"
//								Exception in thread "pool-1-thread-11" java.lang.NumberFormatException: For input string: "삼"
//								Exception in thread "pool-1-thread-1" java.lang.NumberFormatException: For input string: "삼"
//								Exception in thread "pool-1-thread-12" Exception in thread "pool-1-thread-6" java.lang.NumberFormatException: For input string: "삼"
//							
								
//								for문이 너무 빨리돌아서... 일시 정지를 줘야겠다.
							
						}
					};
					
					
					
					
//					executorService.execute(runnable);
//			쓰레드 실행
					
//					execute 는 에러 생기면 반환
					
					executorService.submit(runnable);
//					submit은 반환 X
//					얘는 에러도 출력 안하네??
					
					Thread.sleep(100);
//					30으로 줘서는 안되던데?
					
			}
			
			executorService.shutdown();
			
		}
	
}
