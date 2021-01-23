package sec07.exam02_method.substring;

public class StringSubstringExample {

	public static void main(String[] args) {
		String ssn = "930710-1212928";
		String fir = ssn.substring(0,6);
		String sec = ssn.substring(7);
			System.out.println(fir);
			System.out.println(sec);
		String thi = ssn.substring(4,10);
			System.out.println(thi);
	}

}
