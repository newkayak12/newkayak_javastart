package sec09.exam02_blocking;

import java.util.concurrent.*;

public class ResultByCallableExample {

	public static void main(String[] args) {
		int sum = 0;
		ExecutorService executorService = Executors.newFixedThreadPool( 
																					Runtime.getRuntime().availableProcessors()
																				);
		
		ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor)  executorService;
		
		Callable <Integer> task = new Callable<Integer>() {
					@Override
					public Integer call() {
						int sum = 0;
						
								for(int i=1; i<=10; i++) {
									sum+=i;
									int poolSize = threadPoolExecutor.getPoolSize();
									String threadName = Thread.currentThread().getName();	
									
									
										System.out.println("총 스레드의 수 : " + poolSize);
										System.out.println("작업 처리 :  " + threadName);
								}
							
						return sum;
					}
		};
		
		Future<Integer> future = executorService.submit(task);
		
		
			try {
					int result = future.get();
						System.out.println("처리결과 " + result);
						System.out.println("작업 처리 완료");
					
			} catch (InterruptedException e) {
						System.out.println("예외");
					e.getMessage();
//				쓰레드가 인터럽트
			} catch (ExecutionException e) {
						System.out.println("예외");
					e.getMessage();
				
//				쓰레드 코드 실행 중 예외 만났을 떄
			}
			
			
			executorService.shutdown();
		


	}

}
