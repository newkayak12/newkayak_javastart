package sec04.exam03_CompareOperation;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * &&����, ||����, ^��Ÿ������, !������ ����(AND)�� �� �� true �� �� true ����(OR)�� �� �� �ϳ���
		 * true �� �� true ��Ÿ������(XOR)�� ���� ���� �ٸ� ��(true/false, false/true)�� �� true, ���� ����
		 * ��(true/true, false/false)�� �� false ������(!)�� boolean���� ���� !true�� false,
		 * !false�� true
		---------------------------------------------------------------------------------------------------
		&&�� &, ||�� |�� ���� ���� ������ ���� ����� �ٸ� &&�� ù��° ���� true�� �ƴϸ� �ٷ� false, true�� �� ���� ���� �˻�
		&&�� &���ٴ� ���� 
		||�� ���� ���� true�� �׳� trueó�� �׷��� ù��° ���� false�� |�� ���� ���� ���
		||�� |���� ����
		��������� �� ����� ���Ѵٰ� ��*/
	
		int charCode = 'A';//A�� �����ڵ尡 ����(65) - int�ϱ�
		//int charCode = 'a';
		//int charCode = '7';
		
		
		if((charCode>=65) && (charCode<=90))	{ //65=A
			System.out.println("�빮���Դϴ�.");    
			} else 
	        {if((charCode>=97) && (charCode<=122)) { //97=a
			System.out.println("�ҹ����Դϴ�.");
			} else
			{if(!(charCode<48) && !(charCode>57)) { //48=0
			System.out.println("0~9 ���� �����Դϴ�.");
			} }}
			
			int value = 6;
			int value2 = 11;
			if((value%2 ==0 ) | (value%3==0)) {
				System.out.println("2�� ����̰ų� 3�� ����Դϴ�.");
			} //���� ��, ���� �� �Ѵ� �� true�� ��� (tt,tf,ft)
			
			
			if((value2%2 ==0 ) || (value2%3==0)) {
				System.out.println("2�� ����̰ų� 3�� ����Դϴ�.");
			}  else{System.out.println("2 �Ǵ� 3�� ����� �ƴմϴ�.");}//���� ���� true�� ���� �� ���� �� �� (ft�� ���� �� �� ��
			
		
		
	
	}
		}
