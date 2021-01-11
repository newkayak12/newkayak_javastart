package sec03.exam03_localclass_access;

public class Outter {
//before java 7
	
	public void method1(final int args) {
		final int localVariable = 1;
		
				class Inner {
						void method() {
							int args = 10;
							int localVariable = 1;
							int result = args + localVariable;
				
//				자바 7 이전은 위와 같이 사용하면 컴파일 에러 (final) 이 빠져서
//				final을 붙이면 메소드 내로 복사가 된다. (compiler가 해줌)
//				메소드1의 로컬변수와 매개변수는 스택에서 삭제된다.
						}
				}
	}		
//after java 8
	public void method2( int args) {
		 int localVariable = 1;
		
				class Inner {
//					final을 안 붙였을 경우의 위치
						void method() {
							
//						final을 붙였을 경우의 위치
						
							int args = 10;
							int localVariable = 1;
							int result = args + localVariable;
						}
//				자바 8 이후에는 final을 안 붙여도 컴파일러가 자동적으로 처리해줌
//				final을 붙이면 클래스 메소드 내부 로컬 변수로, 안 붙이면 안쪽 클래스의 필드로 선언된다.
//				메소드1의 로컬변수와 매개변수는 스택에서 삭제된다.
						}
				}
	
		
	
}
