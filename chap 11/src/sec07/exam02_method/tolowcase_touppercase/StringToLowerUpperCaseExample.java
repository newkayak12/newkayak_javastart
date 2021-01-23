package sec07.exam02_method.tolowcase_touppercase;

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		
		String str1 = "Java Programming";
		String str2 ="JAVA Programming";
			System.out.println(str1.equals(str2));
//			대소문자를 구분한다.
//			만약 저 둘을 같은지 알고 싶으면, 다 대문자 or 다 소문자로 바꾸고 비교하면 되는거겠지
			
		String lowerstr1 = str1.toLowerCase();
		String lowerstr2 = str2.toLowerCase();
				
				System.out.println(lowerstr1.equals(lowerstr2));
				
//		혹은 대소문자 상관없이 비교하는 메소드가 있다.
				System.out.println(str1.equalsIgnoreCase(str2));
				
		String upperstr1 = str1.toUpperCase();
		String upperstr2 =str2.toUpperCase();
				System.out.println(upperstr1.equals(upperstr2));
	}

}
