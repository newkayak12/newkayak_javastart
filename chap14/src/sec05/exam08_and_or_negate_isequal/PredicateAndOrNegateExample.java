package sec05.exam08_and_or_negate_isequal;

import java.util.function.*;

public class PredicateAndOrNegateExample {

	public static void main(String[] args) {
		
		
//		2의 배수를 검사하는 predicate
		
		IntPredicate predicateA = a-> a%2 == 0;
		
		//3의 배수
		IntPredicate predicateB = a -> a%3 ==0;
		
		
		IntPredicate predicateAB;
		
		boolean result;
		
		/////////////////////////////////and
		
		predicateAB = predicateA.and(predicateB); //둘 다 true가 되면 true
		
		result = predicateAB.test(9);
//		a에 대해서 평가 > b에 대해서 평가
				System.out.println("9는 2,3의 배수? : " + result);
				
				
		////////////////////////////////or				
				
				
				predicateAB = predicateA.or(predicateB); //둘 중 하나만 true가 되면 true
				
				result = predicateAB.test(9);
//				a에 대해서 평가 > b에 대해서 평가
						System.out.println("9는 2,3의 배수? : " + result);
						
						
		////////////////////////////////negate
				predicateAB = predicateA.negate(); //A의 값이 true이면 false
				result = predicateAB.test(9);
				
					System.out.println("9는 홀수?? : " + result);
						
						
						
				
	}

}
