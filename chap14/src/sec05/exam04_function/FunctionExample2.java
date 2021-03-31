package sec05.exam04_function;

import java.util.*;
import java.util.function.*;

public class FunctionExample2 {
	private static List<Student> list = Arrays.asList(
			
			
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
	);

	public static double avg( ToIntFunction<Student> function ) {
		
			int sum =0;
				
				for(Student student : list) {
					sum += function.applyAsInt(student);
					
				}
				
			double avg = sum / list.size();
			
			
			return avg;
	}
	
	
	public static void main(String[] args) {
		
		
			double engAvg = avg(t -> t.getEngScore());
			
			
			double matAvg = avg (t -> t.getMathScore());
					
					System.out.printf("영어 평균 점수 %.2f \n 수학 평균 점수 %.2f", engAvg, matAvg);
	
	
	
		
	}
}