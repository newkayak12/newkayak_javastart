package sec04.exam01_nested_interface;

import sec04.exam01_nested_interface.Button.*;

public class MessageListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("Texting...");
	}
	

}
