package sec05.exam01_String_Equals;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String strVal1 = "이시하라 사토미";
String strVal2 = "이시하라 사토미";

if(strVal1 == strVal2) {
	System.out.println();
	System.out.println("비교 연산자 사용");
	System.out.println("strVal1과 strVal2는 참조가 "+ '\'' + strVal1+ '\'' +"로 같음");
}else {
	System.out.println();
	System.out.println("비교 연산자 사용");
	System.out.println("strVal1과 strVal2는 참조가 "+ '\'' + strVal1+ '\'' + "로 다름");
}


String strVal3 = new String ( "이시하라 사토미");
String strVal4 = new String ( "이시하라 사토미");

if(strVal3 == strVal4) {
	System.out.println();
	System.out.println("비교 연산자 사용");
	System.out.println("strVal3과 strVal4는 참조가 "+ '\'' + strVal3+ '\'' + "로 같음");
}else {
	System.out.println();
	System.out.println("비교 연산자 사용");
	System.out.println("strVal3과 strVal4는 참조가 "+ '\'' + strVal3+ '\''+ "로 다름");
}

if(strVal3.equals(strVal4)) {
	System.out.println();
	System.out.println("equals 메소드를 사용");
	System.out.println("strVal3과 strVal4는 참조가 "+ '\'' + strVal3+ '\'' + "로 같음");
}else {
	System.out.println();
	System.out.println("equals 메소드를 사용");
	System.out.println("strVal3과 strVal4는 참조가 "+ '\'' + strVal3+ '\''+ "로 다름");



}}}
