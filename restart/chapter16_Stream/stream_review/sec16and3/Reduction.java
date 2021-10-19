package stream_review.sec16and3;

import java.util.Arrays;
import java.util.List;

import lambda.Student;

public class Reduction {
	/*
		기본적으로 집계 메소드인 sum, average, count, max, min을 제공하지만
		다양하게 구현 할 수 있도록 reduce메소드를 제공한다. 
	*/
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student("HONG", 92),new Student("SHIN", 95),new Student("KIM", 88));

		int sum1 = students.stream().mapToInt(Student::getScore).sum();
		int sum2 = students.stream().map(Student::getScore).reduce((a,b)->a+b).get(); //reduce(BinaryOpertator<Integer> ac )
		int sum3 = students.stream().map(Student::getScore).reduce(0,(a,b)->a+b);

		System.out.println(sum1+" : "+sum2+" : "+sum3);

	}
}
