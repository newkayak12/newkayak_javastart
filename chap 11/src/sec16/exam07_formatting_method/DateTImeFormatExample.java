package sec16.exam07_formatting_method;

import java.time.*;
import java.time.format.*;

public class DateTImeFormatExample {

	public static void main(String[] args) {
		//parsing과 반대  문자열로 돌려 놓기
		LocalDateTime localDateTIme = LocalDateTime.now();
		DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("yyyy 년 MM 월 dd일 a h시 m분");
		String stringNow = localDateTIme.format(dateTimeFormat);
		
			System.out.println(stringNow);
			
		
	}

}
