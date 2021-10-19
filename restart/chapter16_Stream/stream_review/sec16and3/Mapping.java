package stream_review.sec16and3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

import lambda.Student;

public class Mapping {
	/*
		매핑은 중간 처리 기능으로 스트림의 요소를 다른 요소로 대체하는 작업을 한다.(매핑하는 작업)
		flatXXX // mapXXX // asDoubleStream, asLongStream, boxed가 있다.

		flatMapXXX은 복수 개의 요소들로 구성된 새로운 스트림을 반환한다. 
		예를 들어 A, B가 원본 스트림이라면 A1,A2, B1,B2 요소를 가지는 새로운 스트림을 반환한다. 
	*/

	public static void main(String[] args) {
		List<String> input = Arrays.asList("JAVA8 LAMBDA", "STREAM MAPPING");
		input.stream().flatMap(data->Arrays.stream(data.split(" "))).forEach(System.out::println);
		//split으로 새로운 스트림을 반환한다. 

		List<String> input2 = Arrays.asList("10, 20, 30", "40, 50, 60");
		input2.stream().flatMapToInt(n->{
			String[] strArr = n.split(",");
			int[] intArr = new int[strArr.length];
			for(int i = 0; i<strArr.length; i++){
				intArr[i] = Integer.parseInt(strArr[i].trim());
			}

			System.out.println("--");
			return Arrays.stream(intArr);
		}).forEach(System.out::println);



		/*
			mapXXX는 요소를 대체하는 요소로 구성된 새로운 스트림을 반환한다. 
			예를 들어 원본이 A,B라면 A는 C가 되고 B는 D가 된다.  
			결과적으로 C와 D로 새로운 스트림을 생성해서 반환한다. 
		*/

		List<Student> students = Arrays.asList(new Student("HONG", 10), new Student("SHIN", 20), new Student("YOO", 30));

		students.stream().mapToInt(Student::getScore).forEach(System.out::println);



		//int 값을 double, long 등으로 새롭게 반환할 수 있다. 
		int[] intArr = {3,5,1,2,4,6};
		Arrays.stream(intArr).asDoubleStream().forEach(System.out::println);
		System.out.println();
		Arrays.stream(intArr).boxed().forEach(System.out::println);
		System.out.println();

		//sorted
		Arrays.stream(intArr).sorted().forEach(System.out::println);

		//객체는 비교하여 정렬할 값을 직접 설정해줘야 정렬이 가능하다. 이는 Comparable을 구현하여 진행한다. 

		List<Person> persons = Arrays.asList(
			new Person("H",30),
			new Person("A",20),
			new Person("K",10)
		);

		persons.stream().sorted().forEach(System.out::println);
		persons.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}
