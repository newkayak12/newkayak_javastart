package sec05.exam01_restricted_type_parameter;

public class BoundedTypeParameterExample {

	public static void main(String[] args) {
		
//		int result1 = Util.compare('a', "B") //심지어 char도 안 됨
		
		int result1 = Util./* <Integer> */compare(10, 20);
		System.out.println(result1);
		int result2= Util.compare(4.5, 3);
		System.out.println(result2);
		
	}

}
