package chap08.sec06.exam01_interface_extends;

public class ImplementationC  implements InterfaceC{

		@Override
	public void methodA() {
		System.out.println("implementationC-method A run");
	}

		@Override
	public void methodB() {
			System.out.println("implementationC-method B run");
	}

		@Override
	public void methodC() {
			System.out.println("implementationC-method C run");
	}

	
}
