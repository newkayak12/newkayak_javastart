package sec04.exam01_Arithmetic;

public class Question_IntOverflowShowBinaryString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int ���� ������ �ʰ��ؼ� �ٽ� �����ϴ� ������ �������� ��� ó���� �Ǵ��� ���� �; ���� Ŭ����
		long a1=1000000;
		long a2=1000000;
		long result= a1*a2;
		System.out.println(toBinaryString(result));
		int i1=1000000;
		int i2=1000000;
		int reuslt2=i1*i2;
		System.out.println(reuslt2);
		//System.out.prinln(toBinaryString(result2));
		
		long resulterror=-727379968;
		System.out.println(toBinaryString(resulterror));
		
		// ��� �ؾ� �����÷ο�Ǽ� ���̰��� ��ȯ�Ǵ� ������ �� �� �ִ°���?**
		
	}
	public static String toBinaryString(long value) {
		String str= Long.toBinaryString(value);
		
		while(str.length()<32) {
			str = "0" +str;
			
		}
		
		return str;
	}
	public static String toBinaryString(int value) {
		String str= Integer.toBinaryString(value);
		
		while(str.length()<32) {
			str = "0" +str;
			
		}
		
		return str;
	}
}
