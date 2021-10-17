package functionalInterface.parameter;

public class MyfunctionalInterfaceExample {
	public static void main(String[] args) {
		MyfunctionalInterface fi ;

		fi= (x)->{
			int result = x*5;
			System.out.println(result);
		};
		fi.method(5);


		fi=(x)->{System.out.println(x*5);};
		fi.method(5);

		fi=(x)->System.out.println(x*5);
		fi.method(5);
	}
}
