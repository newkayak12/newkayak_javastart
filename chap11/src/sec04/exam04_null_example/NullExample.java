package sec04.exam04_null_example;

import java.util.*;

public class NullExample {

	public static void main(String[] args) {
		
		String str1 = "hong	";
		String str2 = null;
		
		
			System.out.println(Objects.requireNonNull(str1));
			// null이 아니면 str1을 return
			
//			requireNonNull 1
			try {
				System.out.println(Objects.requireNonNull(str2));
			// NullPointException
			} catch( NullPointerException e) {
				System.out.println(e.getMessage());
//										 그냥  null 이라고만 나옴
			}
			
//			requireNonNull 2
			try {
				System.out.println(Objects.requireNonNull(str2,"이름이 없습니다."));
			// NullPointException
			} catch( NullPointerException e) {
				System.out.println(e.getMessage());
//										 위에 작성핮 메시지 나옴
			}
			
//			requireNonNull 3(람다식...)
			try {
				System.out.println(Objects.requireNonNull(str2,()->"이름이 없습니다."));
			// NullPointException
			} catch( NullPointerException e) {
				System.out.println(e.getMessage());
			}
//			()->이게 람다식..?
			
			System.out.println(Objects.isNull(str1));
//			null이 아니면 false
			System.out.println(Objects.isNull(str2));
//			null이면 true
			
			System.out.println(Objects.nonNull(str1));
//			null이 아니면 true
			System.out.println(Objects.nonNull(str2));
//			null이면 false
	}

}
