package functionalInterface.existreturn;

public class MyfunctionalInterfaceExample {
	public static void main(String[] args) {
		MyfunctionalInterface fi;
		fi =(x,y)->{
			int result = x*y;
			return result;
		};
		System.out.println(fi.method(5, 20));

		fi= (x,y)->{return x*y;};
		System.out.println(fi.method(5, 20));

		fi= (x,y)-> x*y;
		System.out.println(fi.method(5, 20));

		fi=(x,y)-> sum(x, y);
		System.out.println(fi.method(5, 20));
	}

	public static int sum (int x, int y){
		return (x+y);
	}
}
