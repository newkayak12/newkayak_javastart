package parallel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExmaple {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍","김","이","박","나","최");

		Stream<String> linear = list.stream();
		linear.forEach(ParallelExmaple::print);
		/*
			홍 : main
			김 : main
			이 : main
			박 : main
			나 : main
			최 : main

		*/

		System.out.println("\n");

		Stream<String> parallel = list.parallelStream();
		parallel.forEach(ParallelExmaple::print);

		/*
			박 : main
			최 : main
			홍 : ForkJoinPool.commonPool-worker-9
			나 : ForkJoinPool.commonPool-worker-7
			김 : ForkJoinPool.commonPool-worker-3
			이 : ForkJoinPool.commonPool-worker-9
		*/
	}

	public static void print (String str){
		System.out.println(str+" : "+Thread.currentThread().getName());
	}
}
