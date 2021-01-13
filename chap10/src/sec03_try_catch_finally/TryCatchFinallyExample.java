package sec03_try_catch_finally;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		System.out.println("존재하지 않는 클래스를 넣었을 경우 : ");
		try {
		Class clazz = Class.forName("java.lang.String2");
//		Class.forName > 뒤 문자열로 되어있는 클래스를 찾아서 class타입으로 리턴
//		만약 저 이름 클래스가 없으면 리턴될 수가 없음
//		그래서 잘못된 클래스 이름을 입력해서 예외가 발생할 수 있음 (Unhandled exception type ClassNotFoundException)
//		 ClassNotFoundException : 일반예외 > 밑줄은 예외처리가 필요하다는 메시지를 담고있고 
//		예외 처리를 안 하면 컴파일 안 해주겠다고 협박하고 있음
//		그래서 try로 저 녀석을 감쌀거임
		
		} catch(ClassNotFoundException e) {
//			이러한 예외가 발생하 catch 블록으로 흐름이 바뀜
			System.out.println("	클래스가 존재하지 않습니다.");
//			예외는 발생했지만 프로그램이 종료되는 것은 막았다.
		}	
		System.out.println();
		System.out.println("존재하고 있는  클래스를 넣었을 경우 : ");
			try {
				Class clz = Class.forName("java.lang.String");
				System.out.println("	클래스를 찾았습니다.");
			} catch(ClassNotFoundException f ) {
				System.out.println("	클래스가 존재하지 않습니다.");
				
			} finally {
//				예외가 존재하지 않더라도 finally로 흘러 들어옴
				System.out.println("	프로그램을 안전하게 종료합니다.");
			}
		
	}

}
