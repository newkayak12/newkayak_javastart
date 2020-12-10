package sec04.exam03_CompareOperation;



public class CompareOperatiorExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//문자는 유니코드로 비교함 boolean은 true / false가 같냐 하는 동등비교 ==, !=에서 사용 
		//sysout = System.out.println();
		int num1= 10;
		int num2= 10;
		boolean result1= (num1==num2);
		System.out.println(result1);
		boolean result2= (num1!=num2);
		System.out.println(result2);
		boolean result3= (num1<=num2);
		System.out.println(result3);
		
		
		char char1= 'A';
		char char2= 'B';
		boolean result4= (char1<char2);//유니코드로 비교?
		System.out.println(result4);
	}

}
