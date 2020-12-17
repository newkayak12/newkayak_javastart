package sec06.exam02_Array_bynew;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr1= new int[3]	;
float [] arr2 = new float[3];
double [] arr3 = new double[3];
for(int i =0; i<3; i++) {
	System.out.println("arr1[" + i +"]:" + arr1[i]);
	System.out.println("arr2[" + i + "]:" + arr2[i]);
	System.out.println("arr3[" + i + "]:" + arr3[i]);
}


System.out.println("----------------------");
arr1[0] =10;
arr1[1] =20;
arr1[2] =30;
arr3[0] = 0.1;
arr3[1] = 0.2;
arr3[2] = 0.3;

for (int i=0; i<3; i++) { 
	System.out.println("arr1[" + i +"]:" + arr1[i]);
	System.out.println("arr3[" + i + "]:" + arr3[i]);
}

System.out.println("------------------------------------");
String[] arr4 = new String[3];
for(int i =0; i<3; i++) {
	System.out.println("arr4[" + i +"]:" + arr4[i]);
	}
System.out.println("-------------------------");
arr4[0] ="1¿ù";
arr4[1] ="2¿ù";
arr4[2]	="3¿ù";
for(int i =0; i<3; i++) {
	System.out.println("arr4[" + i +"]:" + arr4[i]);
	}

}
}
