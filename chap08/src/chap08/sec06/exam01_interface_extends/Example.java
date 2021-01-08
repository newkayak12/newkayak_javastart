package chap08.sec06.exam01_interface_extends;

public class Example {

	public static void main(String[] args) {
		ImplementationC imp = new ImplementationC();
		
		InterfaceA ia = imp;
		ia.methodA();
		// interfaceA type has a methodA so only use that one
		
		InterfaceB ib = imp;
		ib.methodB();
		// same as upper case
		
		InterfaceC ic = imp;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
		// interfaceC is herited InterfaceA and B so inC's constructed objects can use all the method of them
	}

}
