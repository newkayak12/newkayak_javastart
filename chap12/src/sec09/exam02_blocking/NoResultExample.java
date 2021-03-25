package sec09.exam02_blocking;

import java.util.concurrent.*;

public class NoResultExample {
		public static void main(String[] args) {
			int sum = 0;
			ExecutorService executorService = Executors.newFixedThreadPool( 
																						Runtime.getRuntime().availableProcessors()
																					);
			
			ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor)  executorService;
			
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					int sum = 0;
					
					for(int i=1; i<=10; i++) {
						sum+=i;
						int poolSize = threadPoolExecutor.getPoolSize();
						String threadName = Thread.currentThread().getName();	
						
						
							System.out.println("총 스레드의 수 : " + poolSize);
							System.out.println("작업 처리 :  " + threadName);
					}
					
					System.out.println("result" + sum);
				}
			};
			
			Future future = executorService.submit(runnable);
//			결과 같이 아니다.. 다 끝나지 않아도 return, 지연객체... 쓰레드가 작업을 다 완료할 때까지 지연했다가 결과값을 받는다.
//			작업이 끝날 때까지만 blocking
			
			
				try {
						future.get();
//						null을 줄거야 얘는 
//						get은 블로킹 될거야 흠...
						
						System.out.println("작업 처리 완료");
						
				} catch (InterruptedException e) {
							System.out.println("예외");
						e.getMessage();
//					쓰레드가 인터럽트
				} catch (ExecutionException e) {
							System.out.println("예외");
						e.getMessage();
					
//					쓰레드 코드 실행 중 예외 만났을 떄
				}
				
				
				executorService.shutdown();
			
		}
}
