package mapping.aggregate.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Optional {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		//java.util.NoSuchElementException
		// double avg = list.stream().mapToInt(Integer::intValue).average().getAsDouble();

		//01.
		OptionalDouble avg2 = list.stream().mapToInt(Integer::intValue).average();		

		if(avg2.isPresent()){
			System.out.println("방법 1 "+avg2.getAsDouble());
		} else {
			System.out.println("0.0");
		}

		//02.
		double avg3 = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
		System.out.println("방법 2 "+avg3);

		//03
		list.stream().mapToInt(Integer::intValue).average().ifPresent(a->System.out.println("방법 3 "+ a));

	}
}
