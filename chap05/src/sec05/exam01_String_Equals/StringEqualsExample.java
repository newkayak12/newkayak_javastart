package sec05.exam01_String_Equals;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String strVal1 = "�̽��϶� �����";
String strVal2 = "�̽��϶� �����";

if(strVal1 == strVal2) {
	System.out.println();
	System.out.println("�� ������ ���");
	System.out.println("strVal1�� strVal2�� ������ "+ '\'' + strVal1+ '\'' +"�� ����");
}else {
	System.out.println();
	System.out.println("�� ������ ���");
	System.out.println("strVal1�� strVal2�� ������ "+ '\'' + strVal1+ '\'' + "�� �ٸ�");
}


String strVal3 = new String ( "�̽��϶� �����");
String strVal4 = new String ( "�̽��϶� �����");

if(strVal3 == strVal4) {
	System.out.println();
	System.out.println("�� ������ ���");
	System.out.println("strVal3�� strVal4�� ������ "+ '\'' + strVal3+ '\'' + "�� ����");
}else {
	System.out.println();
	System.out.println("�� ������ ���");
	System.out.println("strVal3�� strVal4�� ������ "+ '\'' + strVal3+ '\''+ "�� �ٸ�");
}

if(strVal3.equals(strVal4)) {
	System.out.println();
	System.out.println("equals �޼ҵ带 ���");
	System.out.println("strVal3�� strVal4�� ������ "+ '\'' + strVal3+ '\'' + "�� ����");
}else {
	System.out.println();
	System.out.println("equals �޼ҵ带 ���");
	System.out.println("strVal3�� strVal4�� ������ "+ '\'' + strVal3+ '\''+ "�� �ٸ�");



}}}
