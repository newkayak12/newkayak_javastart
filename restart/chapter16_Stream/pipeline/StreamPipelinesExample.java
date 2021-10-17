package pipeline;

import java.util.Arrays;
import java.util.List;

public class StreamPipelinesExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(new Member("A", Member.FEMALE, 30),new Member("B", Member.MALE, 60),new Member("C", Member.FEMALE, 19),new Member("D", Member.MALE, 23));
		double ageAvg = list.stream().filter(m->m.getSex()==Member.MALE).mapToInt(Member::getAge).average().getAsDouble();

		System.out.println(ageAvg);
	}
}
