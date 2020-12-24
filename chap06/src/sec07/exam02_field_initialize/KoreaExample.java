package sec07.exam02_field_initialize;

public class KoreaExample {

	public static void main(String[] args) {
Korea kr1 = new Korea("조보아", "882010-2225192");
System.out.println("kr1의 국적 " + kr1.nation);
System.out.println("kr1의 이름 " + kr1.name);
System.out.println("kr1의 주민등록번호 " +kr1.ssn);
System.out.println();
	
Korea kr2 = new Korea("정인선", "901230-2229120");
System.out.println("kr2의 국적 " + kr2.nation);
System.out.println("kr2의 이름 " + kr2.name);
System.out.println("kr2의 주민등록번호 " +kr2.ssn);

	}

}
