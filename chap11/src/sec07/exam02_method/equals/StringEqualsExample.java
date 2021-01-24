package sec07.exam02_method.equals;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = new String("shin young gwan");
		String strVar2 = "shin young gwan";
		String strVar3 = "shin young gwan";
		
		
			if(strVar1 == strVar2) {
				System.out.println("Same");
			} else {
				System.out.println("Different");
			}
			
			
			if(strVar2 ==strVar3) {
				System.out.println("Same");
			} else {
				System.out.println("Different");
			}
			
			if(strVar1.equals(strVar2)) {
				System.out.println("Same");
			} else {
				System.out.println("Different");
			}
			
//			equals는 objects 가 같고 있던 method인데 override됨
			
	}

}
