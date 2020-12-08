package sec04.exam01_Arithmetic;

public class CheckOverflowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int result = left + right; //���⼭ left, right�� ����ڰ� �Է��� ���̰ų� DB���� �ҷ��� ���̰ų� �ܺο��� �����ϴ� ��

		try {
	int result = safeAdd(2000000000, 2000000000);
	System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println("�����÷ο찡 �߻��Ͽ� ������ �� ����.");
			
			
		}
	}

	public static int safeAdd(int left, int right) {
		if(right >0) {
				if(left> (Integer.MAX_VALUE-right)) {
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
