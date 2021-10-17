package collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {
	public static void main(String[] args) {
		
		List<Student> totalList = Arrays.asList(
			new Student("홍길동", 10, Student.Sex.MALE, Student.City.Seoul),
			new Student("김수애", 6, Student.Sex.FEMALE, Student.City.Pusan),
			new Student("신용권", 10, Student.Sex.MALE, Student.City.Seoul),
			new Student("박수미", 6, Student.Sex.FEMALE, Student.City.Pusan)
			);
			
		Map<Student.Sex, List<Student>> mapBySex = totalList.stream().collect(Collectors.groupingBy(Student::getSex));
		
		System.out.println("MALE");		
		mapBySex.get(Student.Sex.MALE).stream().forEach(s->System.out.println(s.getName()));

		System.out.println("\n FEMALE");
		mapBySex.get(Student.Sex.FEMALE).stream().forEach(s->System.out.println(s.getName()));

		System.out.println();

		Map<Student.City,List<String>> mapByCity = totalList.stream().collect(Collectors.groupingBy(Student::getCity, Collectors.mapping(Student::getName,Collectors.toList())));

		System.out.println("\n SEOUL");
		System.out.println(mapByCity.get(Student.City.Seoul));

		System.out.println("\n PUSAN");
		System.out.println(mapByCity.get(Student.City.Pusan));
	}
}
