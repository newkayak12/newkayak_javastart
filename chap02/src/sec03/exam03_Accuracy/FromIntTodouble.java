package sec03.exam03_Accuracy;

public class FromIntTodouble {

	public static void main(String[] args) {
		int num1 =123456780;
		int num2 =123456780;
		
		double num3 =num2;
				System.out.println(num3);
				System.out.println(0x4E8);
				
		num2=(int)num3;
		
		int result= num1-num2;
				System.out.println(result);
	}
}
