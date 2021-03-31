package sec05.exam04_function;

import java.util.*;
import java.util.function.*;

public class FunctionExample1 {
	private static List<Student> list = Arrays.asList(
			
			
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
	);
			
	public static void printString(Function<Student, String> function) {
//																		매개, 리턴
				for(Student student : list) {
					
					System.out.println(function.apply(student)+" ");

				}
			
				System.out.println();
		
	}
	
	public static void printInt(ToIntFunction<Student> function) {
			
				for(Student student : list) {
					
					System.out.println(function.applyAsInt(student)+" ");
	
				}
			
				System.out.println();

		
	}
	
	
	public static void main(String[] args) {
		
		
		
				System.out.println("학생 이름");
				
				printString(t -> { return  t.getName(); } ); 
				
				
				System.out.println("영어 성적");
				
				printInt(t -> {return t.getEngScore(); });
				
				
				System.out.println("수학 성적");
				
				printInt(t -> {return t.getMathScore(); });
	}

}
