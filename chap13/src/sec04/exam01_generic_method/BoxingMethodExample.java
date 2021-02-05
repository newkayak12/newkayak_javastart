package sec04.exam01_generic_method;

public class BoxingMethodExample {

	public static void main(String[] args) {
		Box<Integer> box = Util.<Integer>boxing(100);
//		<Integer> Box<Integer> sec04.exam01_generic_method.Util.boxing(Integer t)
		int intValue = box.get();
		System.out.println(intValue);

		
		Box<String> box2 = Util.boxing("start");
		String strValue = box2.get();
		System.out.println(strValue);
	}

}
