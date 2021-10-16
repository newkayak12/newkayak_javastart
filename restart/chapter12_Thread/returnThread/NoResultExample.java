package returnThread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExample {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
// 프로레스 만큼 쓰레드 만들고

		System.out.println("[start]");

		Runnable runnable = new Runnable(){
			@Override
			public void run() {
				int sum = 0 ;
				for(int i = 1; i<=10; i++){
					sum+=i;
				}
				System.out.println("[result ] " + sum);

				// return이 없다.
			}
		};

		Future future = executorService.submit(runnable);
		// Thread로 

		try {
			future.get();
			System.out.println("[작업 처리 완료]");
		} catch (Exception e) {
			System.out.println("[exception]");
			e.printStackTrace();
		}

		executorService.shutdown();
		/*
			[start]
			[result ] 55
			[작업 처리 완료]
		*/
	}
}
