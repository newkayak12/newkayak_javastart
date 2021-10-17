package mapNreduce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lambda.Student;


public class MapAndReduceExample {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student("hong",10),new Student("choi",20),new Student("shin",40));

		double avg = students.stream().mapToInt(Student::getScore).average().getAsDouble();
		System.out.println("avg : "+avg);
	}
}
