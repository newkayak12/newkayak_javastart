package sec04.exam01_nested_interface;

import sec04.exam01_nested_interface.Button.*;

public class CallListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("Calling...");
	}
	

}
