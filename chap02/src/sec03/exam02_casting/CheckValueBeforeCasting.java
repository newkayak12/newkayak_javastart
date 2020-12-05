package sec03.exam02_casting;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {
		
		//case1
		
		int i=128;
		//byte b= (byte)i; error : 4byte to 1byte
		
		if(i<Byte.MIN_VALUE || i>Byte.MAX_VALUE) {
			
		 System.out.println("입력하신 값이 잘못되었습니다.");
		 System.out.println("값을 다시 입력해주십시오.");
		} else {
			
		byte b= (byte) i;
		System.out.println(b);
		
		}
		
		
		//case2
		
		int A=127;
		if(A<Byte.MIN_VALUE || A>Byte.MAX_VALUE) {
			
			 System.out.println("입력하신 값이 잘못되었습니다.");
			 System.out.println("값을 다시 입력해주십시오.");
			} else {
				
			byte C= (byte) A;
			System.out.println(C);
			
	}
	}}
