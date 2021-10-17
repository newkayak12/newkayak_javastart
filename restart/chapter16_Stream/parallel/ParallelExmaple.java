package parallel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExmaple {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍","김","이","박","나","최");

		Stream<String> linear = list.stream();
		linear.forEach(ParallelExmaple::print);

		System.out.println("\n");

		Stream<String> parallel = list.parallelStream();
		parallel.forEach(ParallelExmaple::print);
	}

	public static void print (String str){
		System.out.println(str+" : "+Thread.currentThread().getName());
	}
}
