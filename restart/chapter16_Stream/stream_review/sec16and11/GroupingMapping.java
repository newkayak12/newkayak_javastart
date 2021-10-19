package stream_review.sec16and11;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import collect.Student;

public class GroupingMapping {
	/*
		mapping(Function<T,U> mapper, Collector<U, A, R> collector);
		averagingDouble(ToDoubleFunction<T> mapper);
		counting()
		maxBy(Comparator<T> comparator)
		minBy(Comparator<T> comparator)
		summingInt(ToIntFunctoin)
		summingLong(ToLongFunction)
		summingDouble(ToDoubleFunction)
	*/

	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
			new Student("홍길동", 10, Student.Sex.MALE),
			new Student("김수애", 6, Student.Sex.FEMALE),
			new Student("신용권", 10, Student.Sex.MALE),
			new Student("박수미", 6, Student.Sex.FEMALE)
		);

	/*
		Function<Student, Student.Sex> classifier = Student::getSex;
		ToDoubleFunction<Student> mapper = Student::getScore;
		Collector<Student,?,Double> collector1 = Collectors.averagingDouble(mapper);
		Collector<Student,?,Map<Student.Sex,Double>> collector2 = Collectors.groupingBy(classifier, collector1);

		Map<Student.Sex,Double> mapBySex = totalList.stream().collect(collector2);
	*/

	// 이를 정리하면, 
	
		Map<Student.Sex,Double> mapBySex = totalList.stream().collect(
			Collectors.groupingBy(
				Student::getSex,
				Collectors.averagingDouble(Student::getScore)
			)
		);
	

	//
		Map<Student.Sex,String> mapByName = totalList.stream().collect(
			Collectors.groupingBy(
				Student::getSex,
				Collectors.mapping(
					Student::getName, 
					Collectors.joining(","))
			)
		);


	}
}
