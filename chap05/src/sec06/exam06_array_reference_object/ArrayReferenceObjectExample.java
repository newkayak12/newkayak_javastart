package sec06.exam06_array_reference_object;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] strArray=new String[3];
strArray[0]="java";
strArray[1]= "java";
strArray[2]= new String("java"); //[0],[1]은 같은 주소 값을 가지고 [2]는 다른 주소를 같고 있지만 equals로 비교하면 같은 문자로 뜨겠지
System.out.println(strArray[0]==strArray[1]);
System.out.println(strArray[0]==strArray[2]);
System.out.println(strArray[0].equals(strArray[2]));
	}

}
