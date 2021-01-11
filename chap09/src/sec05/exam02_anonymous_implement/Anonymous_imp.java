package sec05.exam02_anonymous_implement;

public class Anonymous_imp {

	RemoteControl field = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("turn on Tv");			
		}

		@Override
		public void turnOff() {
			System.out.println("turn off Tv");
		}
	
	};
//	field

		void method1 () {
			RemoteControl localVar = new RemoteControl() {

				@Override
				public void turnOn() {
					System.out.println("turn on audio");			
				}

				@Override
				public void turnOff() {
					System.out.println("turn off audio");
				}
			
			};
			localVar.turnOn();
			localVar.turnOff();
		}
//	local variables in method
		
		
		
		void method2 (RemoteControl rc) {
//			in RemoteControl rc, implemted objects can be used
			rc.turnOn();
			rc.turnOff();
		}

}
