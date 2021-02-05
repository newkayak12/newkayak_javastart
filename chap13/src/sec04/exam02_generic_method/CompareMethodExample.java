package sec04.exam02_generic_method;

public class CompareMethodExample {

	public static void main(String[] args) {
	
		
		Pair<Integer, String> pair1  = new Pair<>(1, "apple");
		Pair<Integer, String> pair2  = new Pair<>(1, "apple");
		
		boolean result = Util.<Integer, String>compare(pair1, pair2);
//		boolean result2 = Util.<>compare(pair1, pair2);
		
			if(result ) {
				System.out.println("same");
			} else {
				System.out.println("not same");
			}
		
			
			
			Pair<String, String> pair3  = new Pair<>("usr1", "apple");
			Pair<String, String> pair4  = new Pair<>("usr2", "apple");
			
			boolean result1 = Util./* <String, String>  -> 유추하게 생략할 수 있다.*/compare(pair3, pair4);
//			boolean result2 = Util.<>compare(pair1, pair2);
			
				if(result1 ) {
					System.out.println("same");
				} else {
					System.out.println("not same");
				}
			
		
		
	}

}
