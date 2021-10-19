package stream_review.sec16and2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import collect.Student;

public class FromCollectionAndArrayAndNumber {
	static int num ;
	public static void main(String[] args) {
		// Collection

		List<stream_review.sec16and2.Student> list1 = Arrays.asList(new stream_review.sec16and2.Student("A", 30),new stream_review.sec16and2.Student("B", 20),new stream_review.sec16and2.Student("C", 10));

		Stream<stream_review.sec16and2.Student> stream = list1.stream();
		
		stream.forEach(s->System.out.println(s.getName()));

		// Array		
		
		String[] arr = {"A","B","C"};
		Stream<String> stream2 = Arrays.stream(arr);
		stream2.forEach(s->System.out.println(s));

		int[] arr2 = {1,2,3,4,5};
		IntStream stream3 = Arrays.stream(arr2);
		stream3.forEach(s->System.out.println(s));

		// 숫자 범위로 스트림을 얻기 

		IntStream stream4 = IntStream.rangeClosed(1, 200);
		//rangeClosed는 두 번째 매개값까지 포함하고
		//range는 두 번째 매개값을 포함하지 않는다. 

		stream4.forEach(s-> num+=s);
		System.out.println(num);
	}
}
