package sec04.exam01_Arithmetic;

public class StringConcatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1="JDK" + 14.0;
		String str2 = str1 +" Ư¡";
		System.out.println(str2);

		
		//���ڿ� ���� ������ +�� ���ʿ������� ������ ����+����+���ڸ� ���� ���� ���� ������ ������ ����+����+���ڸ� ���ڳ��� ��� ���+���ڿ�
		String str3="jdk" + 3 +3.0; 
		System.out.println(str3); //jdk33.0
		String str4= 3+ 3.0 +"jdk";
		System.out.println(str4); //6.0jdk ��... ��򸮰Ե� ��������
		
	}

}
