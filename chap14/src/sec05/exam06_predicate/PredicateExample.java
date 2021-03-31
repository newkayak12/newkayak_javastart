package sec05.exam06_predicate;

import java.util.*;
import java.util.function.*;

public class PredicateExample {

		private static List<Student> lis = Arrays.asList(
		
				new Student("김미자", "남", 82),
				new Student("홍미니", " 여", 79),
				new Student("이미라", "여", 80), 
				new Student("하지우", "남", 90)
				
		);
				
		
		public static double avg(Predicate<Student> predicate) {
			
			int count = 0;
			int sum =0;
				
				for(Student student : lis) {
					
					if(predicate.test(student)) {
						
						count++;
						sum += student.getScroe();
					}
				}
			
			return sum/(double)count;
		}
	
	
	public static void main(String[] args) {
		
//		남자평균
		
		double maleAvg = avg( t  ->	t.getSex().equals("남"));
		
			System.out.println(maleAvg);
			
			
		double femaleAvg = avg( t -> t.getSex().equals("여"));
		
// 	  여자 평균	
			System.out.println(femaleAvg);
		
		
	}

}
