import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
	public static void main(String[] args) {
		Class clazz = null;
		
		
		try {
			clazz = Class.forName("examClass.Car");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		Constructor[] constructors = clazz.getDeclaredConstructors();
		Field[] fields = clazz.getDeclaredFields();
		Method[] methods = clazz.getDeclaredMethods();

		System.out.println("\nCONSTRUCTOR");

		for(Constructor con : constructors){
			System.out.print(con.getName() +"(");
			Class[] parameters = con.getParameterTypes();
			printParam(parameters);
			System.out.println(")");
			
		}

		System.out.println("\nFIELD");
		for(Field fi :  fields){
			System.out.println(fi.getType().getSimpleName()+ " : "+ fi.getName());
		}

		System.out.println("\nMETHOD");
		for(Method method : methods){
			System.out.print(method.getName()+ "(");
			Class[] param = method.getParameterTypes();
			printParam(param);
			System.out.println(")");
		}

	}

	private static void printParam(Class[] param){
		for(int i = 0; i<param.length; i++){
			System.out.print(param[i].getName());
			if(i<param.length-1){
				System.out.print(" , ");
			}

		}
	}
}
