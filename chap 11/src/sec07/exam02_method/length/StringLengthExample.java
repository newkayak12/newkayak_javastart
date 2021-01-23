package sec07.exam02_method.length;

public class StringLengthExample {

	public static void main(String[] args) {
		
		String str = "7306241230123";
			System.out.println(str.length());
			
			
			if(str.length()==13) {
				System.out.println("this is ssn");
						
			} else {
				System.out.println("this is not ssn");
			}
		
	}

}
