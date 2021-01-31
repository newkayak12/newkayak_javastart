package sec11.exam01_arrays.method_search;

import java.util.*;

import sec11.exam01_arrays.method_sort.*;

public class SearchExample {

	public static void main(String[] args) {
		
		int[] scores= {99,98,97};
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("찾은 인덱스 " + index);
		
//		정렬을 안하면 엉뚱한 값이 나옴
		
		
		String[] names = {"홍길동", "박동수", "김민수"};
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "홍길동");
		System.out.println("찾은 인덱스 " + index);
		
	
	
	
		Member m1 = new Member("홍길동");
		Member m2 = new Member("박동수");
		Member m3 = new Member("김민수");
		
		
		Member[] members = {m1,m2,m3};
		
		Arrays.sort(members);
		
		Arrays.binarySearch(members, m1);
	
	}

}
