package sec10.exam01_static_member;

public class CalculatorExample {

	public static void main(String[] args) {
			double result1 = 10*10* Calculator.pi;
 //value of pi is supported by java origin method (Math.pi)
			int result2 = Calculator.plus(10, 5);
			int result3 = Calculator.minus(10, 5);
			
			System.out.println("result1 : " + result1);
			System.out.println("result2 : " + result2);
			System.out.println("result3 : " + result3);
	}

	
	
//     			     instance member           V       static member
//   Field 			Each objects				 |		common data
//     			 must have each data	         |
//
//  method   should work with           |   don't need to use instance field
//					instance field                   |

// 'this.' cannot  be used with static situation


}
