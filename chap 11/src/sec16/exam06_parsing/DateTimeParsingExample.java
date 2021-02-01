package sec16.exam06_parsing;

import java.time.*;
import java.time.format.*;
import java.util.*;

public class DateTimeParsingExample {

	public static void main(String[] args) {
		DateTimeFormatter formatter;
		
		LocalDate localDate;
		
		localDate = LocalDate.parse("2024-05-21");
			System.out.println(localDate);
			
		formatter = DateTimeFormatter.ISO_LOCAL_DATE;
		localDate = LocalDate.parse("2024-05-21",formatter);
			System.out.println(localDate);
			
		formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		localDate = LocalDate.parse("2024/05/21",formatter);
			System.out.println(localDate);
			
		formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		localDate = LocalDate.parse("2024.05.21",formatter);
			System.out.println(localDate);
	}

}
