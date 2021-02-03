package sec02.exam02_generic_type;


public class BoxExample {
		public static void main(String[] args) {
			
			
			Box<String> box = new Box<String>();
//			이렇게 생성하 제네릭 자리에 Object가 들어간다. > 의미가 없지

			
//			box.set(10);
//			강한 타입 검사
			
			box.set("Test");
			String test = box.get();
			
			Box<Integer> box2 = new Box<Integer>();
			box2.set(1);
			int testInt =box2.get();
		
	}
}
