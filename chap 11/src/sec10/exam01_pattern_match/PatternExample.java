package sec10.exam01_pattern_match;

import java.util.regex.*;

public class PatternExample {

	public static void main(String[] args) {
		
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-2711-4160";
		
		boolean result = Pattern.matches(regExp, data);
			if(result == true) {
				System.out.println(data);
				
			} else {
				System.out.println("잘못된 형식입니다.");
			}
			
			
			
			String emailattern = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
																								//여기는 co.kr같이 더 붙을 수도 있을 경우
			String email = "newkayak12@gmail.com";
			boolean result2 = Pattern.matches(emailattern, email);
			if(result2 == true) {
				System.out.println(email);
				
			} else {
				System.out.println("잘못된 형식입니다.");
			}
	}

}
