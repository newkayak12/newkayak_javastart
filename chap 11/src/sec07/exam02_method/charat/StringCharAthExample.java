package sec07.exam02_method.charat;

public class StringCharAthExample {

	public static void main(String[] args) {
		String ssn = "010624-12230123";
		char sex= ssn.charAt(7);
			switch(sex) {
				case '1' :
				case '3' :
						System.out.println("Male");
						break;
						
				case '2':
				case '4': 
						System.out.println("Female");
						break;
			
			}
	}

}
