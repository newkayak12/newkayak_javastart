package verify.pr07_custom_exception;

public class Login {
	public static void login(String id , String password) throws NotExistIdException, WrongPasswordException {
			if(!id.equals("blue")) {
				throw new NotExistIdException("Wrong Id");
				
			}else if(!password.equals("12345"))  {
				throw new NotExistIdException("Wrong Password");
				
			}else if(id.equals("blue")&& password.equals("12345")) {
				System.out.println("login success");
			}
			
			
			
	}
	
}
