package sec05.exam02_anonymous_implement;

public class AnonymousExample_imp {

	public static void main(String[] args) {

			Anonymous_imp anon = new Anonymous_imp();
			
			anon.field.turnOn();
			anon.field.turnOff();
//			field
			System.out.println("------------------");
			anon.method1();
//			method
			System.out.println("-------------------");
			
			anon.method2(new RemoteControl() {
				@Override
				public void turnOn() {
					System.out.println("turn on mac");			
				}

				@Override
				public void turnOff() {
					System.out.println("turn off mac");
				}
			
			});
			
//			parameter
	}

}
