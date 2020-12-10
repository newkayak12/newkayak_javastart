package sec04.exam05_Bit;

public class BitShiftExmaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("1 << 3 =  " + (1 << 3));
System.out.println(("-8 >> 3 =  ")+ (-8>>3));
System.out.println(("-8 >>> 3 =  ")+ (-8>>>3));
System.out.println("--------------------------------");
System.out.println(toBinaryString(-8));
System.out.println(">> 3 =  ");
System.out.println(toBinaryString(-8>>3));  //  최상위 부호비트가 그대로 움직임
System.out.println('\t');
System.out.println(toBinaryString(8));
System.out.println(">> 3 =  ");
System.out.println(toBinaryString(8>>3));
System.out.println('\t');
System.out.println(toBinaryString(-8));
System.out.println(">>> 3 =");
System.out.println(toBinaryString(-8>>>3));	// 그대로 밀림
	}

	public static String toBinaryString(int value)	{
		String str = Integer.toBinaryString(value);
		while(str.length()<32) {
			str="0"+str;
		}
		return str;
	}
}
