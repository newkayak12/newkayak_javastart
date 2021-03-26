package sec09.exam02_blocking;

import java.util.concurrent.*;

public class ResultByRunnableExample {

	public static void main(String[] args)  {
			ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
			
				System.out.println("작업처리 요청");
			
			
				
			class Task implements Runnable{
					
					Result result;
					
					public Task(Result result) {
						this.result = result;
					}
					
					@Override
					public void run() {
						int sum =0;
							
							for(int i =1; i<=10; i++) {
								sum+=i;
							}
							
							
						result.addValue(sum);
					}
				
			};
			
//			공유 객체(외부 객체)
			Result result = new Result();
			
//			두 개의 작업을 정의할 것
			Runnable task1 = new Task(result);
			Runnable task2 = new Task(result);
			
			
			Future<Result> future1 = executorService.submit(task1, result);
			Future<Result> future2 = executorService.submit(task2, result);
			
			
				try {
							result = future1.get();
							result = future2.get();
							
							System.out.println("result : "+ result.accumValue);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
				executorService.shutdown();
	}

}


class Result {
	int accumValue;
	
	synchronized void  addValue(int value) {
		accumValue += value;
	}
	
}