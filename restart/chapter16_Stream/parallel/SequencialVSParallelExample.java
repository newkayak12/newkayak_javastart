package parallel;

import java.util.Arrays;
import java.util.List;

public class
 SequencialVSParallelExample {
	public static void work(int value){
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public static long testSequencial(List<Integer> list){
		long start = System.nanoTime();
		list.stream().forEach(a->work(a));
		long end = System.nanoTime();

		return end-start;
	}


	public static long testParallel(List<Integer> list){
		long start = System.nanoTime();
		list.stream().parallel().forEach(a->work(a));
		long end = System.nanoTime();
		return end-start;
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0,1,2,3,4,5,6,7,8);

		long timeSequencial = testSequencial(list);
		long timeParallel = testParallel(list);

		if(timeParallel<timeSequencial){
			System.out.println("병럴 처리가 더 빠름");
		} else{
			System.out.println("순차 처리가 더 빠름");
		}
	}
}
