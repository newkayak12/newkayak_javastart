package sec04.exam07_ConditionalOperator;

public class ConditionalOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * ���ǽ�(�ǿ�����1, ���ǿ�����) ? �� �Ǵ� �����(�ǿ�����2) : �� �Ǵ� �����(�ǿ�����3) �Ǵٰܱ� / (true�� ���) /
		 * (false�� ���)
		 */
		 
		
		  //3�׿����ڷ� ǥ���ϸ�
		  int score = 85;
		  char grade = (score>=90)? 'A' :((score>=80)? 'B' : 'C');
		  System.out.println(score + "����" + grade + "�Դϴ�.");
		 
		  
		  //if�� ǥ���ϸ�
		  if(score>=90) {
			 System.out.println(score + "���� A�Դϴ�.");
		 }else {if(score>=80) {
			 System.out.println(score + "���� B�Դϴ�.");
		 }else {
			 System.out.println(score + "���� C�Դϴ�.");
		 }
			 
		 }
	}
	

 }
