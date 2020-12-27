package sec13.exam02_constructor_modifier.package2;

import sec13.exam02_constructor_modifier.package1.*;

public class C {
	A a1 =new A(true);
	//public one, it can be used in this class and anywhere.
	
	//A a2 = new A();
	// default one, it can be used in the class oneself and involved package's class  that A class involved
	// so It can't be used
	
	//A a3 = new A("hello");
	// private one, i can be used only in the class that constructor has been made
	// so It can't be used
}
