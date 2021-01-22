package sec04.exam01_objects;

import java.util.*;

public class CompareExample {

		public static void main(String[] args) {
	
			// objects class
	//		This class consists of static utility methods for operating on objects. 
	//		These utilities include null-safe or null-tolerant methods for computing the hash code of an object, 
	//		returning a string for an object, and comparing two objects.
			Student s1 = new Student(1);
			Student s2 = new Student(1);
			Student s3 = new Student(2);
			
			int result = Objects.compare(s1, s2, new StudentComparator());
	//		(비교 대상, 비교 대상, 비교 방법)
	//		비교 방법 작성을 위해서 comparator라는 인터페이스를 구현해야함
	//		물론 익명 객체로 작상할 수도 있다.
			System.out.println(result);
			
			
			int result2 = Objects.compare(s1, s3, new StudentComparator());
			System.out.println(result2);
			
			int result3 = Objects.compare(s3, s1, new StudentComparator());
			System.out.println(result3);
		}
		
	static class Student{
		int sno;
		
		public Student(int sno) {
			this.sno=sno;
		}
	}
	
	static class StudentComparator implements Comparator<Student>{
	
			@Override
			public int compare(Student a, Student b) {
//					if(a.sno<b.sno) {
//						return -1;
//					} else if(a.sno == b.sno) {
//						return 0;
//					} else {
//						return 1;
				
//				or
				
				return Integer.compare(a.sno, b.sno);
					}
				
			}
		
	

}
