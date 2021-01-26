package sec11.exam01_arrays.method_array_copy_of_range;

import java.util.*;

public class ArraysCopyOfRange {
	public static void main(String [] args) {
		
		char[] arr1= {'J', 'A',	'V', 'A'};
		
		char [] arr3 = Arrays.copyOfRange(arr1, 1, 3);
			System.out.println(Arrays.toString(arr3));
	}
}
