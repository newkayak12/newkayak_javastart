package sec04.exam01_Arithmetic;

public class Question_IntOverflowShowBinaryString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int 값이 범위를 초과해서 다시 시작하는 과정을 이진수로 어떻게 처리가 되는지 보고 싶어서 만든 클래스
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
		
		// 어떻게 해야 오버플로우되서 더미값이 변환되는 과정을 볼 수 있는거지?**
		
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
