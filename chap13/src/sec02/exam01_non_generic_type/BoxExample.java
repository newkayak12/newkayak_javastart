package sec02.exam01_non_generic_type;

public class BoxExample {

	public static void main(String[] args) {
		Box box = new Box();
		
		box.set("Test");
		
	
		String test = (String)box.get();
		
		box.set( new Apple() );
//		와... 엄청나긴 하네...
		
		Apple apple = (Apple) box.get();
	}

}
