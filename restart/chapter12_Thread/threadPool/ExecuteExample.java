package threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;


public class ExecuteExample {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);

		for(int i = 0; i<10; i++){
			Runnable runnable = new Runnable(){
				@Override
				public void run() {
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;

					int poolSize = threadPoolExecutor.getPoolSize();
					String threadName = Thread.currentThread().getName();

					System.out.println("----------- size : " + poolSize + " : name" + threadName);

					int val = Integer.parseInt("s");
				}
			};
			// executorService.execute(runnable); // 에러가 나면 쓰레드가 제거되고 새로 생성됨
			executorService.submit(runnable); // 에러나면 쓰던 쓰레드를 재활용

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


		executorService.shutdown();
	}
}
