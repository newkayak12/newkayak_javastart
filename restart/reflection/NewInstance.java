import examClass.Car;

public class NewInstance {

	public static void main(String[] args) {
		Object obj = null;
	
		try {
			Class clazz = Class.forName("examClass.Car");
			obj = clazz.newInstance();
		} catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		((Car)obj).setName("h1");;

		System.out.println(((Car)obj).getName());
	}
}
