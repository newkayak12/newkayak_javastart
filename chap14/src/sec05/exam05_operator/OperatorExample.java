package sec05.exam05_operator;

import java.util.function.*;

public class OperatorExample {
	private static int[] scores = {92, 95, 87};
	
	
	public static int maxOrMin(IntBinaryOperator operator) {
			
			int result = scores[0];
			
				for(int piece : scores) {
					
					result = operator.applyAsInt(result,  piece);
//					둘 중에 큰 값, 작은 값을 리턴하도록..하는... 이러면 그냥 몸무게 같은거 이걸로 비교해도 되는거 아님? 와..
					
				}
		
		
		
				return result;
	}
	
	public static void main(String[] args) {
		
		int max = maxOrMin(
		
//				최대값
					(a,b) -> {
								if( a>= b) {
									
									return a;
									
								} else {
									
									return b;
								}
					}
		);
		
		
		int min = maxOrMin(
				
			(a,b) -> {
						if(a>=b) {
							return b;
						} else {
							return a;
						}
			}
				
		);
				
				System.out.println("max " + max);
				System.out.println("min "+ min);
				
				
		
	}

}
