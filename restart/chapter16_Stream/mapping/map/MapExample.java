package mapping.map;

import java.util.Arrays;
import java.util.List;

import lambda.Student;

public class MapExample {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student("홍길동", 30),new Student("신용권", 20),new Student("유미선", 10));

		students.stream().mapToInt(Student::getScore).forEach(score->System.out.println(score));
	}
}
