package sec04.exam05_tostring;

import java.util.*;

public class ToStringExample {

	public static void main(String[] args) {

		String str1 = "hong"	;
		String str2 = null;
		
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
//		그냥  null
		
		System.out.println(Objects.toString(str2,"이름이 없습니다."));
//		뒤의 매개변수가 default 메시지가 된다. 그래서 얘를 출력하면 "이름이 없습니다."
	}

}
