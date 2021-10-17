package getStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import lambda.Student;

public class CollectionExample {
	public static void main(String[] args) {
		List<Student> stu = Arrays.asList(new Student("A", 20),new Student("B", 40),new Student("C", 50),new Student("D", 30));
		Stream<Student> stream = stu.stream();
		stream.forEach(s->System.out.println(s.getName()+"_"+s.getScore()));
	}
}
