package verify.pr07_custom_exception;

public class LoginExample {

	public static void main(String[] args) {
		Login log = new Login();
			try{
				log.login("white", "12345");
			} catch(Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			
			
			
			try {
				log.login("blue", "54321" );
				
			} catch(Exception e ) {
				System.out.println(e.getMessage());
				e.printStackTrace();
				
			}
	}

}
