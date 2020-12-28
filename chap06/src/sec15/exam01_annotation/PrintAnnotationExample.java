package sec15.exam01_annotation;

import java.lang.annotation.*;
import java.lang.reflect.*;
public class PrintAnnotationExample {

		public static void main( String[] args ) {
			
			Method [] declaredMethods = Service.class.getDeclaredMethods();
			
				for (Method method : declaredMethods) {
					//System.out.println(method.getName()	);
					//method name
					
					if( method.isAnnotationPresent(PrintAnnotation.class))  {
						//System.out.println(method.getName() + " has been applied");
						
							PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
							System.out.println(method.getName() + ":"); //get method name
							
							//System.out.println(printAnnotation.value());
							//System.out.println(printAnnotation.number());
							
							for(int i =0; i<printAnnotation.number(); i++) { //get annotation values
								System.out.print(printAnnotation.value()); 
							}
							System.out.println();
							
							
							try {
								method.invoke(new Service());
							} catch (Exception e) {
								
							} System.out.println();
							
							//call method + exception
							// is same as   
							// Service service = new Service();
							//service.method1();
					
					} else {// System.out.println(method.getName() + " hasn't been applied");
					
					}
				}
			
		}
}
