package varify.exam15;

public class MemberServiceExample {

	public static void main(String[] args) {

		MemberService memSer= new MemberService();
		
			boolean result = memSer.login("hong","12345");
			
			if( result ) { System.out.println("longged in");
								memSer.logout("hong");
								
			} else { System.out.println("id or passward is wrong");
				
			}
	}

}
