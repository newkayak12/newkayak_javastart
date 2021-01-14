package sec06_throws;

public class ThrowsExample {

	public static void main(String[] args) {
//  throws로 발생할 수 있는 예외를 (메소드에서) 해당 예외를 처리하고 있는 곳으로 보내서 처리 
//		똥을 싸는 곳, 치우는 곳 따로 있는 시스템
		
//		근데 API에서 발생하는 예외를 우리가 다 어떻게 알아?
//		jdk에서 제공하는 api에서 작성된 메소드에는  throws ~~Exception하면서 예외처리를 암시하고 있음
	try {
		findClass();
//		Unhandled exception type ClassNotFoundException
//		아직 예외 처리를 안해서! 
//		사용하는 곳에서 예외처리를 해야되!
	} catch(ClassNotFoundException e) {
		System.out.println("class is not exist");
	}
		
		
	}
	
	
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
//		ClassNotFoundException 일반 예외를 발생
// try catch로 직접 처리는 안하지만 throws로 떠넘김
	}
	
	
}
