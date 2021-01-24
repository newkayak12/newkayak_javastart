package sec07.exam02_method.trim;

public class StringTrimExample {

	public static void main(String[] args) {
//사용자가 실수로 공백을 넣을 수도 있다.
		String oldstr = "  Apple macbook air           ";
		String newstr = oldstr.trim();
			System.out.println(oldstr);
			System.out.println(newstr);
	}

}
