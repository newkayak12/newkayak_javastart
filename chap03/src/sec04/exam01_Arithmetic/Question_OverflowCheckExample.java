package sec04.exam01_Arithmetic;

public class Question_OverflowCheckExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	//safeAdd �޼ҵ� ����
	int result= safeAdd(2000000000,2000000000);
	System.out.println(result);
} catch(ArithmeticException e) {
	System.out.println("�����÷ο�");
}
}
	
	//safeAdd �޼ҵ� �ۼ�
	public static int safeAdd(int left, int right) {
		if((right>0)) {
			if(left>(Integer.MAX_VALUE-right)) { /*left>(Integer.MAX_VALUE-right)�� ���������� �����ϸ� 
				                                   left+right>Integer.MAX_VALUE�ε� �� ���� ������ ���ž�? ������ �ι�° ��ó�� �ᵵ ������°� �ƴ�?
				                                   ���� �ѹ� �� �����ϰ� �̷��� ���ɱ�? ������ �ֳ�? 
				                                   ������ ��¥ ���ؾȰ���... 	*/ 
				throw new ArithmeticException("�����÷ο� �߻�");
			}
			
		}else {
			if(left<(Integer.MIN_VALUE-right)) {
				throw new ArithmeticException("�����÷ο� �߻�");
				
			}
		}
	return left + right;
	}
	

}
