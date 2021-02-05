package sec06.exam01_wildcard;

import java.util.*;

public class WildCardExample {
	
	public static void registerCourse( Course<?> course ) {
		System.out.println(course.getName() +   "수강생 : " + Arrays.toString(course.getStudents()));
	}
	
	public static void registerStudent( Course<? extends Student> course ) {
		System.out.println(course.getName() +   "수강생 : " + Arrays.toString(course.getStudents()));
	}
	
	public static void registerWorker( Course<? super Worker> course ) {
		System.out.println(course.getName() +   "수강생 : " + Arrays.toString(course.getStudents()));
	}
	
	
	public static void main(String[] args) {
	/*	
//	Course<?>	
		registerCourse( new Course<Person>("일반인 과정", 5) );
		registerCourse( new Course<Worker>("직장인 과정", 5) );
		registerCourse( new Course<Student>("학생 과정", 5) );
		registerCourse( new Course<HighStudent>("고등부 과정", 5) );
		
//		Course<? extends Student>	
//			registerStudent( new Course<Person>("일반인 과정", 5) );
//			registerStudent new Course<Worker>("직장인 과정", 5) );
			registerStudent( new Course<Student>("학생 과정", 5) );
			registerStudent( new Course<HighStudent>("고등부 과정", 5) ); 
			
			
//			Course<? super Worker>	
			registerWorker( new Course<Person>("일반인 과정", 5) );
			registerWorker( new Course<Worker>("직장인 과정", 5) );
//			registerWorker( new Course<Student>("학생 과정", 5) );
//			registerWorker( new Course<HighStudent>("고등부 과정", 5) );
	*/
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////// 와일드 카드확인
		
		Course<Person> personCourse = new Course<Person>("일반인 과정", 5);
//		수강 신청 받기
		personCourse.add(new Person("일반인"));
		personCourse.add(new Person("직장인"));
		personCourse.add(new Person("학생"));
		personCourse.add(new Person("고등학생"));
		System.out.println();
		Course<Worker> workerCourse = new Course<Worker>("직장인 과정", 5);
		workerCourse.add(new Worker("직장인"));
		System.out.println();
		Course<Student> studentCourse = new Course<>("학생 과정", 5);
		studentCourse.add(new  Student("학생"));
		studentCourse.add(new  HighStudent("학생"));
		System.out.println();
		Course<HighStudent> highCourse = new Course<>("고등 과정",5);
		highCourse.add(new HighStudent("고딩"));
		
		
		System.out.println("\n");
//		과정 등록 메소드 (3개)
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highCourse);
//		다 올 수 있다. 
		
		
		
		System.out.println("\n");
//		<Course ? extends Student> course
//		registerStudent(personCourse);
//		registerStudent(workerCourse);
		registerStudent(studentCourse);
		registerStudent(highCourse);
		
		
		System.out.println("\n");
//		<Course ? super Worker> course
		registerWorker(personCourse);
		registerWorker(workerCourse);
//		registerWorker(studentCourse);
//		registerWorker(highCourse);
		
		
		
		
		
	}
}
