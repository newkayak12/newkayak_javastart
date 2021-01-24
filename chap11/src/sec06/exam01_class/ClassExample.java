package sec06.exam01_class;

public class ClassExample {

	public static void main(String[] args) {
		Car cr = new Car();
		Class clazz1 = cr.getClass();
//		객체로부터 얻어내기
			System.out.println(clazz1.getName());
//					sec06.exam01_class.Car
			
			System.out.println(clazz1.getSimpleName());
//				Car
			
			System.out.println(clazz1.getPackage().getName());
//			sec06.exam01_class
			
	///////////////////////////////////////////////////////////////////////////////////////////////////////////		
			System.out.println();
			
//			문자열로 얻기
			try {
			Class clazz2 = Class.forName("sec06.exam01_class.Car");
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
			
			} catch ( ClassNotFoundException e ) {
				
				e.printStackTrace();
				
			}
	}

}
