package sec06.exam06_array_reference_object;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] strArray=new String[3];
strArray[0]="java";
strArray[1]= "java";
strArray[2]= new String("java"); //[0],[1]�� ���� �ּ� ���� ������ [2]�� �ٸ� �ּҸ� ���� ������ equals�� ���ϸ� ���� ���ڷ� �߰���
System.out.println(strArray[0]==strArray[1]);
System.out.println(strArray[0]==strArray[2]);
System.out.println(strArray[0].equals(strArray[2]));
	}

}
