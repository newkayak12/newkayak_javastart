package sec03.exam02_casting;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {
		
		//case1
		
		int i=128;
		//byte b= (byte)i; error : 4byte to 1byte
		
		if(i<Byte.MIN_VALUE || i>Byte.MAX_VALUE) {
			
		 System.out.println("�Է��Ͻ� ���� �߸��Ǿ����ϴ�.");
		 System.out.println("���� �ٽ� �Է����ֽʽÿ�.");
		} else {
			
		byte b= (byte) i;
		System.out.println(b);
		
		}
		
		
		//case2
		
		int A=127;
		if(A<Byte.MIN_VALUE || A>Byte.MAX_VALUE) {
			
			 System.out.println("�Է��Ͻ� ���� �߸��Ǿ����ϴ�.");
			 System.out.println("���� �ٽ� �Է����ֽʽÿ�.");
			} else {
				
			byte C= (byte) A;
			System.out.println(C);
			
	}
	}}
