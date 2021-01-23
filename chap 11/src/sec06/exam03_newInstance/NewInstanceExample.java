package sec06.exam03_newInstance;

public class NewInstanceExample {

	public static void main(String[] args) {
		
		try {
			Class clazz = Class.forName("sec06.exam03_newInstance.ReceiveAction");
			Action action  = (Action) clazz.newInstance();
			action.execute();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (InstantiationException e) {

			e.printStackTrace();
		} catch (IllegalAccessException e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}

}
