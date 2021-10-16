package basicGeneric;


public class BoxExample {
	public static void main(String[] args) {
		Box<String> box1 = new Box<>();
		box1.set("hello");
		String str = box1.get();


		Box<Integer> box2 = new Box<>();
		box2.set(12);
		int value = box2.get();
	}
}
