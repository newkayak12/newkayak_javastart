import examClass.Car;

public class ClassExample {


	public static void main(String[] args) {
		Car car = new Car();

		try {
			Class clazz1 = Class.forName("examClass.Car");
			System.out.println(clazz1.getName());
			System.out.println(clazz1.getSimpleName());
			System.out.println(clazz1.getPackageName());
			System.out.println();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Class clazz2 = car.getClass();
		System.out.println(clazz2.getName());
		System.out.println(clazz2.getSimpleName());
		System.out.println(clazz2.getPackageName());
		System.out.println();
	}
}
