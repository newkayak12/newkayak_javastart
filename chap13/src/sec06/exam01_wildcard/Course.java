package sec06.exam01_wildcard;

public class Course <T/*이 과정을 수강하는 대상이 들어 올 , 그 대상을 가리킬*/> {
		private String name;
		private T[]	students;
//		진짜 자유롭네 제네릭이란거...?
		
		public Course(String name, int capacity) { //capacity는 배열의 길이가 될 것.
			
			this.name=name;
//			students = new T[capacity]; // T가 결정이 안됐는데 배열을 선언 할 수 없음
			students =  (T[]) (new Object[capacity]);
		}
		
		
		public String getName()	{
			return name;
		}
		public T[] getStudents() {
			return students;
		}
		
		
		public void add(T t) {
//			T타입 객체가 들어와서 배열에 저장되는 메소드
			for( int i=0; i<students.length; i++) {
				
				if(students[i]==null	) {
					students[i] = t;
					break;
				}
			}
			
		}
}
