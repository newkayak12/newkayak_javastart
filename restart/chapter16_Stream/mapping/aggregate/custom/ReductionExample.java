package mapping.aggregate.custom;

import java.util.Arrays;
import java.util.List;

import lambda.Student;

public class ReductionExample {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("홍길동", 92),new Student("신용권", 95),new Student("김자바", 88));

		int sum1 = list.stream().mapToInt(Student::getScore).sum();
		int sum2 = list.stream().map(Student::getScore).reduce((a,b)->a+b).get();
		int sum3 = list.stream().map(Student::getScore).reduce(0,(a,b)->a+b);

		System.out.println(sum1+" : "+sum2+" : "+sum3);
	}
}
