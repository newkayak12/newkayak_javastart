package varify.exam15;

public class MemberService {
	//String id, password;
 
			public boolean login( String id,  String password ) {
				//this.id = id;
				//this.password = password;
					if ( id .equals("hong")&& password .equals("12345") ) {
						
						return true;
					}
						return false;
			}
		
			public void logout( String id ) {
				//this.id = id;
				System.out.println("logged out");
			}
}
