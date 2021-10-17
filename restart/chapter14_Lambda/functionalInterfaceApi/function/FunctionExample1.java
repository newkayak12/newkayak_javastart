package functionalInterfaceApi.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;


public class FunctionExample1 {
	private static List<Student> lists = Arrays.asList(new Student("kim",90,80),new Student("lee", 85, 82));

	public static void printString(Function<Student,String> function){
		for(Student stu : lists){
			System.out.println(function.apply(stu)+" ");
		}
		System.out.println();
	}

	public static void printInt(ToIntFunction<Student> function){
		for(Student stu : lists){
			System.out.println(function.applyAsInt(stu)+ " ");
		}
		System.out.println();
	}

	public static double avg(ToIntFunction<Student> function){
		int sum = 0;
		for(Student stu : lists){
			sum += function.applyAsInt(stu);
		}

		return (double) sum /lists.size();
	}


	public static void main(String[] args) {
		System.out.println("학생이름");
		printString(t->t.getName());

		System.out.println("영어 점수");
		printInt(t->t.getEnglish());

		System.out.println("수학 점수");
		printInt(t->t.getMath());

		System.out.println("영어 평균 점수");
		System.out.println(avg(t->t.getEnglish()));

		System.out.println("수학 평균 점수");
		System.out.println(avg(t->t.getMath()));
	}
}
