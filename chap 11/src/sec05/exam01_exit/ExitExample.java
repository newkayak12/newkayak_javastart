package sec05.exam01_exit;

public class ExitExample {

	public static void main(String[] args) {
//		SecurityManager
		System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkExit(int status) {
//				System.exit이 호출되면 얘도 자동 호출됨
				if(status !=5) {
					throw new SecurityException();
				}
			}
		});
		
		
		for(int i=0; i<10; i++) {
				System.out.println(i);
			try {
				System.exit(i);
			} catch(SecurityException e) {
//				catch에 아무 것도 없으면 그냥 예외 무시하고 하던 일 계속함
			}
		}
		
		
		
		
		
		
		
//		그냥...
//		for(int i =0; i<10; i++) {
//			System.out.println(i);
//				if(i==6) {
//					System.exit(0);
//				}
//		}
//		
		
		
		
		
	}

}
