package mapping.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortExample {
	public static void main(String[] args) {
		IntStream stream = Arrays.stream(new int[]{5,2,3,6,1,4});

		stream.sorted().forEach(n->System.out.println(n));
		System.out.println();

		List<Student> stu = Arrays.asList(new Student("홍길동", 30),new Student("노홍철", 10),new Student("유재석", 20));
		
		System.out.println("asc");
		stu.stream().sorted().forEach(s->System.out.println(s.getName()+" : "+s.getScore()));

		System.out.println("desc");
		stu.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s.getName()+" : "+s.getScore()));


	}
}
