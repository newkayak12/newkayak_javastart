package sec04.exam01_class_new;

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		System.out.println("s1 변수는 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수는 또 다른 Student 객체를 참조합니다.");
		
		/* student객체 | Heap영역 
		 *   s1       | 100이라는 Student객체의 주소 참
		 *   s2       | 200이라는 Student객체의 주소 참*/
		
	  
	}

}
