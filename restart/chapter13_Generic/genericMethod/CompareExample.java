package genericMethod;

public class CompareExample {
	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<Integer,String>(1, "사과");
		Pair<Integer, String> p2 = new Pair<Integer,String>(1, "사과");

		boolean result1 = CompareUtil.compare(p1, p2);

		if(result1){
			System.out.println("논리적으로 동등");
		}else {
			System.out.println("논리적으로 같지 않다.");
		}


		Pair<String, String> p3 = new Pair<String,String>("usr1", "사과");
		Pair<String, String> p4 = new Pair<String,String>("usr2", "사과");

		boolean result2 = CompareUtil.compare(p3, p4);

		if(result2){
			System.out.println("논리적으로 동등");
		}else {
			System.out.println("논리적으로 같지 않다.");
		}
	}
}
