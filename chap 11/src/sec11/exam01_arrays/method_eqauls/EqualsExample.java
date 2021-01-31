package sec11.exam01_arrays.method_eqauls;

import java.util.*;

public class EqualsExample {

	public static void main(String[] args) {
		
		int[][] original =  {{2,4},{3,4}};
		
		
//		얕은 복사 후  비교 > 얕은 복사란 주소 값만 복사해서 갖는 것
		
		System.out.println("앝은 복제 비교");
		
		int[][] clone1 = Arrays.copyOf(original, original.length);
		
		System.out.println("배열 번지 비교 ");
		 System.out.println(original.equals(clone1));
		 
		 System.out.println("1차 배열 항목 값  비교 ");
		 System.out.println(Arrays.equals(original, clone1));
//		 1차 배열에 들어 있는 주소 값에 대한 비교
		 System.out.println("중첩 배열 항목 값  비교 ");
		 System.out.println(Arrays.deepEquals(original, clone1));
		
		
		 
//		 깊은 복사 후 비교
		 
		 System.out.println("\n깊은 복제 비교");
		 int[][] clone2 = Arrays.copyOf(original, original.length);
		 clone2[0] = Arrays.copyOf(original[0],original[0].length);
		 clone2[1] = Arrays.copyOf(original[1],original[1].length);
		 
		 
		 System.out.println("배열 번지 비교 ");
		 System.out.println(original.equals(clone2));
		 
		 System.out.println("1차 배열 항목 값  비교 ");
		 System.out.println(Arrays.equals(original, clone2));
//		 1차 배열에 들어 있는 주소 값에 대한 비교
		 System.out.println("중첩 배열 항목 값  비교 ");
		 System.out.println(Arrays.deepEquals(original, clone2));
		
	}

}
