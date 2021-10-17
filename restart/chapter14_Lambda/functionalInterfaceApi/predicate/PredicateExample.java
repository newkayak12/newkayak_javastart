package functionalInterfaceApi.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	private static List<Student> list = Arrays.asList(new Student("kim","M",90),new Student("ju","F",80),new Student("lee","M",95),new Student("park","F",100));

	public static double avg(Predicate<Student> predicate){
		int count = 0;
		int sum = 0;

		for(Student stu : list){
			if(predicate.test(stu)){
				count++;
				sum+=stu.getScore();
			}
		}

		return (double) sum/count;
	}

	public static void main(String[] args) {
		double maleAvg = avg(t->t.getSex().equals("M"));
		double femaleAvg = avg(t->t.getSex().equals("F"));

		System.out.println("남자 평균 "+maleAvg);
		System.out.println("여자 평균 "+femaleAvg);

	}
}
