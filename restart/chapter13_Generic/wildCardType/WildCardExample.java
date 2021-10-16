package wildCardType;

import java.util.Arrays;

import wildCardType.pack.HighStudent;
import wildCardType.pack.Person;
import wildCardType.pack.Student;
import wildCardType.pack.Worker;

public class WildCardExample {
	public static void registerCourse( Course<?> course){
		System.out.println(course.getName() +" 수강생 " + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseStudent( Course<? extends Student> course){
							//최대 학생 ~ 고등 학생만
		System.out.println(course.getName() +" 수강생 " + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseWorker( Course<? super wildCardType.pack.Worker> course){
		System.out.println(course.getName() +" 수강생 " + Arrays.toString(course.getStudents()));
	}

	public static void main(String[] args) {
		Course<Person> persCourse = new Course<>("일반인", 5);
		persCourse.add(new Person("일반인"));
		persCourse.add(new Worker("직장인"));
		persCourse.add(new Student("학생"));
		persCourse.add(new HighStudent("고등학생"));

		
		Course<Worker> worCourse = new Course<>("직장", 5);
		worCourse.add(new Worker("직장인"));

		Course<Student> stuCourse = new Course<>("학생", 5);
		stuCourse.add(new Student("학생"));
		stuCourse.add(new HighStudent("고등학생"));

		Course<HighStudent> highCourse = new Course<>("고등", 5);
		highCourse.add(new HighStudent("고등학생"));

		registerCourse(persCourse);
		registerCourse(worCourse);
		registerCourse(stuCourse);
		registerCourse(highCourse);
		System.out.println();


		// registerCourseStudent(persCourse);
		// registerCourseStudent(worCourse);
		//제네릭으로 막힘
		registerCourseStudent(stuCourse);
		registerCourseStudent(highCourse);
		System.out.println();

		registerCourseWorker(persCourse);
		registerCourseWorker(worCourse);
		// registerCourseWorker(stuCourse);
		// registerCourseWorker(highCourse);
		//제네릭으로 막힘 

	}
}
