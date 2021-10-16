package restrictedParameter;

public class BoundedTypeParameterExample {
	public static void main(String[] args) {
		// String str = Util.compare("A", "B");
		//은 컴파일 에러. 왜냐.. T 의 타입을 number 계열로 막아 놓음 (extends Number)


		int result1 = Util.compare(10, 20);
		System.out.println(result1);

		int result2 = Util.compare(3.5, 2);
		System.err.println(result2);
	}
}
