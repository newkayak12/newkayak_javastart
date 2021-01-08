package chap08.sec07.exam02_default_method_extends;

public class DefaultMethodExtendsExample {

	public static void main(String[] args) {
			ChildInterface1 ci1 = new ChildInterface1() {
				
				@Override
				public void method1() {
					System.out.println("ci1-method1 override");					
				}
				
				@Override
				public void method3() {
					System.out.println("ci1-method3 override");
				}
			};
		ci1.method1();
		ci1.method2();
		ci1.method3();
	System.out.println("-----------------------------------------");
		ChildInterface2 ci2 = new ChildInterface2() {
			
			@Override
			public void method3() {
				System.out.println("ci2-method3 overrided");
//			 in ChildInterface2, method2 has been overrided. so we do not need to override method2 in this class
			}
		};
		ci2.method1();
		ci2.method2();
		ci2.method3();
		System.out.println("----------------------");
		
		ChildInterface3 ci3 = new ChildInterface3() {
			
			@Override
			public void method1() {
				System.out.println("ci3 override method1");
			}
			
			@Override
			public void method3() {
				System.out.println("ci3 override method2");				
			}
			
			@Override
			public void method2() {
				System.out.println("ci3 override method3");				
			}
		};
		ci3.method1();
		ci3.method2();
		ci3.method3();
	
	
	}

}
