package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionsExample {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("hong",92),new Student("lee", 79));

		Stream<Student> stream = list.stream();
		stream.forEach(s->{
			System.out.println(s.getName()+" : "+s.getScore());
		});
	}
}
