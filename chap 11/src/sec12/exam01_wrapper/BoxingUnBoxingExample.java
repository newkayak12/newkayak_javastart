package sec12.exam01_wrapper;

public class BoxingUnBoxingExample {
	public static void main (String [] args) {
		
		//boxing
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("100");
//		이러면 String을 int 로 바꿔서 박싱
		
		Integer obj3 = Integer.valueOf(100);
		Integer obj4 = Integer.valueOf("100");
//		이러면 String을 int 로 바꿔서 박싱
		
		
		//unboxing	
		int value1  = obj1.intValue()	;
		int value2  = obj2.intValue()	;
		int value3  = obj3.intValue()	;
		int value4  = obj4.intValue()	;
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		
		
	}
}
