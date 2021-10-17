package functionalInterface.basic;
public class MyfunctionalInterfaceExample {
	public static void main(String[] args) {
		MyfunctionalInterface fi;

		fi= ()->{
			String str = "method Call1";
			System.out.println(str);

		};
		fi.method();


		fi= ()->{System.out.println("method call2");};
		fi.method();

		fi= ()-> System.out.println("method call3");
		//단일이면 {} 안써도 됨
		fi.method();
	}
}
