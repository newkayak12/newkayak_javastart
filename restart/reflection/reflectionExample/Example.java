package reflectionExample;

public class Example {
	public static void main(String[] args) {
		try {
			Class cz = Class.forName("reflectionExample.SendAction");
			Class cz2 = Class.forName("reflectionExample.ReceiveAction");

			Action send = (Action) cz.newInstance();
			Action receive = (Action) cz2.newInstance();

			send.execute();
			receive.execute();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
