package parallel;

import java.util.Arrays;
import java.util.List;

import collect.MaleStudent;
import collect.Student;

public class MaleStudentExample {
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
			new Student("홍길동", 10, Student.Sex.MALE, Student.City.Seoul),
			new Student("김수애", 6, Student.Sex.FEMALE, Student.City.Pusan),
			new Student("신용권", 10, Student.Sex.MALE, Student.City.Seoul),
			new Student("박수미", 6, Student.Sex.FEMALE, Student.City.Pusan)
			);


		MaleStudent maleStudent = totalList.parallelStream().filter(s->s.getSex()==Student.Sex.MALE).collect(MaleStudent::new, MaleStudent::accumulate, MaleStudent::combine);
		maleStudent.getList().stream().forEach(s->System.out.println(s.getName()));
	}
}
