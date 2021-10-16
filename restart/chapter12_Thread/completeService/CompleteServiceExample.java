package completeService;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompleteServiceExample {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());


		CompletionService<Integer> completionService = new ExecutorCompletionService<>(executorService);

		System.out.println("작업 처리 요망");
		for(int i = 0; i<3; i++){
			completionService.submit(new Callable<Integer>(){

				@Override
				public Integer call() throws Exception {
					int sum =0; 
					for(int j =1; j<=10; j++){
						sum += j;
					}
					
					return sum;
				}
				
			});
		}
		//작업하고

		System.out.println("처리 완료된 작업 확인");
		executorService.submit(new Runnable(){

			@Override
			public void run() {
				while(true){

					try{
						Future<Integer> future = completionService.take();
						int value = future.get();
						System.out.println("처리 결과 "+value);
					} catch (Exception e){
						break;
					}
				}
			}
			
		});
		//작업 한대로 바로 take()


		try{Thread.sleep(3000);}catch(InterruptedException e){}

		executorService.shutdownNow();
	}
}
