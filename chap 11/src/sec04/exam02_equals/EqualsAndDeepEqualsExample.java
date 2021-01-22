package sec04.exam02_equals;

import java.util.*;

public class EqualsAndDeepEqualsExample {

	public static void main(String[] args) {
		
		Integer o1 = 1000;
		Integer o2 = 1000;
//		boxing , Integer o1 = new Integer(1000);과 같다.
		
			System.out.println(Objects.equals(o1, o2));
//		모든 클래스는 Objects를 상속받는다.
			System.out.println(Objects.equals(o1, null));
			System.out.println(Objects.equals(null, null));
//		왜 o1.equals(); 안 쓸까??
//		  o1이 고정되니까...
			System.out.println(Objects.deepEquals(o1, o2));
//		배열이 아니니까 deepequals는 equals랑 똑같다...
		
		
		
		
		Integer[] arr1 = {1,2};
//		이러면 Integer객체가 두 개 생성되서 들어가는 
		int[] arr2 =  {1, 2};
//		int 배열에 리터럴이 두 개
		
		Integer[] arr = {1,2};
		System.out.println();
		System.out.println("equals integer");
		System.out.println(Objects.equals(arr, arr1));
//		번지를 묻는 거고...
		System.out.println();
		System.out.println("deepequals integer");
		System.out.println(Objects.deepEquals(arr, arr1));
//		이거는 Integer객체 안의 항목이 같은 값을 갖고 있는지를 검사하는 것
		
		
		System.out.println("\n\n");
		System.out.println(Objects.deepEquals(null, arr1));
		System.out.println(Objects.deepEquals(arr, null));
		System.out.println(Objects.deepEquals(null,null));
		
		
		
		
	}

}
