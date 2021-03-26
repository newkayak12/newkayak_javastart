package sec09.exam03_callback;

import java.nio.channels.*;
import java.util.concurrent.*;

public class CallbackExample {

		
		private ExecutorService executorService;
//		쓰레드풀
		
		public CallbackExample() {
			executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		}
		
		private CompletionHandler<Integer, Void> callback = new CompletionHandler<Integer,Void>(){

					@Override
					public void completed(Integer result, Void attachment) {
							
							System.out.println("compeleted 실행 : " + result);
						
						
					}
		
					@Override
					public void failed(Throwable exc, Void attachment) {
							
							System.out.println("compeleted 실패 : " + exc.getMessage());
						
						
					}
					
		};
		
		
		
		public void doWork(String x, String y) {
			
			
			Runnable task = new Runnable() {
				
				@Override
				public void run() {
					try {
						
							int intX = Integer.parseInt(x);
							int intY = Integer.parseInt(y);
							
							int result = intX+intY;
							
							callback.completed(result, null);
							
					} catch (NumberFormatException e) {
							
							callback.failed(e, null);
					}
					
					
				}
			};
			
			executorService.submit(task);
		}
		
		public void finish() {
			executorService.shutdown();
		}
		
		
		public static void main(String[] args) {
			
			CallbackExample example = new CallbackExample();
			example.doWork("3", "4");
			example.doWork("3", "삼");
			
			example.finish();
		}
}
