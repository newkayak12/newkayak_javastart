package sec03.exam01_no_argument_no_return;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
	
			MyFunctionalInterFace fi ;
			
//					.1
					fi = () -> {
						String str = "method Call1";
						
							System.out.println(str);
					};
					
					fi.method();
					
					
//					.2
					fi = () -> {
							System.out.println("method Call2");
					};
					
					fi.method();
					
					
//					.3
					fi = () ->	System.out.println("method Call3");
			
			
					fi.method();
					
					
//					Anonymous
					fi = new MyFunctionalInterFace() {
						
						@Override
						public void method() {
							System.out.println("method Call4 _ anony");
						}
					};
					
					fi.method();
	}

}
