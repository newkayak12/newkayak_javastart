package stream_review.sec16and3;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class StreamPipeLineExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
			new Member("A",Member.FEMALE,30),
			new Member("B",Member.MALE,40),
			new Member("C",Member.FEMALE,20),
			new Member("D",Member.MALE,10)
		);


		OptionalDouble ageAvg = list.stream().filter(m->m.getSex()==Member.FEMALE).mapToInt(Member::getAge).average();

		if(ageAvg!=null){
			System.out.println(ageAvg.getAsDouble());
		} else {
			System.out.println("0.0");
		}
	}
}

/*
		필터링		distinct : 중복 제거
중간 처리 			filter : 조건 필터링

		매핑		flatMap
				flatMapToDouble
				flatMapToInt
				flatMapToLong
				map
				mapToDouble
				mapToInt
				mapToLong
				mapToObj
				asDoubleStream
				asLongStream
				boxed
		정렬		sorted
		
		루핑		peek

최종 처리 	  매핑 		allMatch
				anyMatch
				noneMatch
		
		집계		count
				findFirst
				max
				min
				average
				reduce
				sum
		
		루핑		forEach
		수집		collect
*/
