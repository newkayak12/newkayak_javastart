package sec08.exam01_method_declarartion;

public class ComputerExample {

	public static void main(String[] args) {
Computer cmptr = new Computer();

int[] values1= {1,2,3,4,5};
int result1 = cmptr.sum1(values1);
System.out.println(result1);
////////////////////////////////////////////////
int result2 = cmptr.sum1( new int[] {1,2,3,4,5});
System.out.println(result2);
////////////////////////////////////////////////		
int result3 = cmptr.sum2(1,2,3,4,5);
System.out.println(result3);
	}

}
