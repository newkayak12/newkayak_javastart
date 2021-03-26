package sec09.exam02_blocking;

import java.util.concurrent.*;

public class CompletionServiceExample {

	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(executorService);
		
				System.out.println("작업 처리 요망");
		
				for(int i = 0; i<3; i++) {
					
						completionService.submit(new Callable<Integer>() {
			
									@Override
									public Integer call() throws Exception {
											int sum = 0;
													for(int i=1; i<=10; i++) {
														sum +=i;
													}
											
											return sum;
									}
									
								});
						
				}
//			쓰레드풀에 들어간 순서대로 작업이 끝나리라는 보장이 없다. _쓰레드 환경, 생성 시간 등등의 문제 때문에
				System.out.println("처리 완료된 작업 확인");
				
				executorService.submit(new Runnable() {

					@Override
					public void run() {
								while(true) {
									
											try {
												
														Future<Integer> future  = completionService.take();
//														작업이 완료된 순서대로 future...
													int value  = future.get(); //그걸로 작업 결과로 보냄 먼저 끝난 작업 부터 이용하겠다..
//													이 때 get은 block이 안 됨
														System.out.println("결과" + value);
											} catch (InterruptedException | ExecutionException e) {
												
												break;
												
											}
											
								}
							
					}
					
				});
			
					try {
								Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					executorService.shutdownNow();
			
			
	}

}
