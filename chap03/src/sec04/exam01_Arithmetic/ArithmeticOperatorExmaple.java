package sec04.exam01_Arithmetic;

public class ArithmeticOperatorExmaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//����/������ �Ǽ��� ������ ���?
		/* int int1 =10;
		 * int int2 =4;
		 * int result1 =int1/int2; > 2
		 * double result2=int1/in2; >2.0  (0.5�� ���ư�)
		 * double result3 = (int1*1.0)/ int2;
		 * double result3 = (double)int1/int2;
		 * double result3 = int1/(double)int2;
		 * �̷� �������� ���� 2.5�� �������� */

		 int V1=5;
		 int V2=2;
		 
		 int result1= V1+V2; //7
		 System.out.println("result=" + result1);
		 
		 int result2= V1-V2; //3
		 System.out.println("result=" + result2);
		 
		 int result3= V1*V2; //10
		 System.out.println("result=" + result3);
		 
		 int result4= V1/V2; //2(double�̶�� 2.5)
		 System.out.println("result=" + result4);
		 
		 double result5= (V1*1.0)/V2; //2.5
		 System.out.println("resultD=" + result5);
		 double result6= (double) V1/V2; //2.5
		 System.out.println("resultD=" + result6);
		 double result7= V1/(double)V2; //2.5
		 System.out.println("resultD=" + result5);
		 double result8= V1/(V2*1.0); //2.5
		 System.out.println("resultD=" + result8);
		 //V1, V2 �� �� �ϳ��� �Ǽ����� Ÿ���� �ڵ����� ��ȯ�ǰ� �Ǽ��� ���´�.
		 
		 int result9= V1%V2; //1
		 System.out.println("result=" + result9);
				
	}

}
