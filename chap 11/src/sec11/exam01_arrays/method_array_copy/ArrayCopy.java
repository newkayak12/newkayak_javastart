package sec11.exam01_arrays.method_array_copy;

import java.util.*;

public class ArrayCopy {

	public static void main(String[] args) {
		
		char[] arr1= {'J', 'A',	'V', 'A'};
		
		char [] arr2  = new char [arr1.length];
		
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		
		System.out.println(Arrays.toString(arr2));
		
		for(int i = 0; i<arr2.length; i++) {
			System.out.println("arr2["+i+"] = "+arr2[i]);
		}
		
		for(char arrs : arr2) {
			System.out.println(arrs);
		}
		
	}

}
