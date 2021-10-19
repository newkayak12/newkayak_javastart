package stream_review.sec16and11;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import collect.Student;

public class Grouping {
	/*
		> groupingBy(Function <T,K> classifier) 
		> groupingByConcurrent(Function <T,K> classifier)
			==> T를 K로 매핑하고 K에 저장된 list에 T를 저자한 Map 생성

		> groupingBy(Function<T,K> classifier, Collector<T, A, D> collector)
		> groupingByConcurrent (Function<T,K> classifier, Collector<T, A, D> collector)
			==> T를 K에 매핑하고 K에 저장된 D객체에 T를 누적한 Map 생성

		> groupingByConcurrent(Function<T,K> classifier, Supplier<ConcurrentMap<K,D>> mapFactory, Collector<T, A, D> collector)
			==> T를 K로 매핑하고 Supplier가 제공하는 Map에서 K에 저장된 D객체에 T를 누적 
	*/

	public static void main(String[] args) {
		List<Student> tList = Arrays.asList(
			new Student("HONG", 10, Student.Sex.MALE, Student.City.Seoul),
			new Student("KIM", 6, Student.Sex.FEMALE, Student.City.Pusan),
			new Student("SHIN", 10, Student.Sex.MALE, Student.City.Seoul),
			new Student("PARK", 6, Student.Sex.FEMALE, Student.City.Pusan)
		);

		Map<Student.Sex,List<Student>> mapBySex = tList.stream().collect(Collectors.groupingBy(Student::getSex));

		mapBySex.get(Student.Sex.FEMALE).stream().forEach(s->System.out.println(s.getName()));
		mapBySex.get(Student.Sex.MALE).stream().forEach(s->System.out.println(s.getName()));

		Map<Student.City,List<String>> mapByCity = tList.stream().collect(Collectors.groupingBy(Student::getCity,Collectors.mapping(Student::getName, Collectors.toList())));

		mapByCity.get(Student.City.Seoul).stream().forEach(s->System.out.println(s));
		mapByCity.get(Student.City.Pusan).stream().forEach(s->System.out.println(s));
	}
}
