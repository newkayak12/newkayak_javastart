package sec11.exam01_arrays.method_array_copy_of;

import java.util.*;


public class ArraysCopyOf {

	public static void main(String[] args) {
		char[] arr1 = {'j', 'a', 'v', 'a'};
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		
//			for(char arrs : arr2) {
//				System.out.println(arrs);
//			}
		System.out.println(Arrays.toString(arr2));
//		Arrays.toString() 은 객체를 문자로 리
	}

}
