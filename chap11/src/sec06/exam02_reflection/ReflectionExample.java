package sec06.exam02_reflection;

import java.lang.reflect.*;

public class ReflectionExample {

	public static void main(String[] args) throws Exception {
//이러면 jvm쪽에서 처리하게 되는데... 물론 try catch를 쓰는게 좋기는 하지
		
		Class clazz = Class.forName("sec06.exam02_reflection.Car");
		
		
			System.out.println("[class Name] : " + clazz.getName());
			System.out.println();
		
		
//		getConsturctor
			System.out.println("[Constructor Name] : " );
		Constructor[] constructors = clazz.getDeclaredConstructors();
				for( Constructor constructor : constructors) {
						System.out.print(constructor.getName()+ "(");
					Class[] parameters = constructor.getParameterTypes();
						printParameters(parameters);
					
				}
//		이러면 생성자 객체를 만들어서 배열로 return
		
				
				//get field
				System.out.println("[Field Name] : " );
				Field[] fields = clazz.getDeclaredFields();
						for(Field field : fields) {
							System.out.println(field.getType().getSimpleName()+ "  "+ field.getName());
						}
		
					//method
						
						
						System.out.println("[Method Name] : " );
					Method[] methods = clazz.getDeclaredMethods();
						for(Method method : methods) {
							System.out.print(method.getReturnType().getSimpleName());
							System.out.print(method.getName() + "(");
								Class[] parameters = method.getParameterTypes();
								printParameters(parameters);
								System.out.println(")");
						}
	}

	
	private static void printParameters (Class[] parameters) {
		
			for(int i=0; i<parameters.length; i++) {
				System.out.print(parameters[i].getName());
				if(i<(parameters.length-1)) {
					System.out.print(" , ");
				}
				System.out.println(")");
			}
	}
}
