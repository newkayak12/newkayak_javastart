package sec16.exam04_date_time_change;

import java.time.*;
import java.time.temporal.*;

public class DateTimeChangeExample {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
			System.out.println("현재 시간 : " + now);
		
		LocalDateTime targetDateTime = now.withYear(2077);
			System.out.println("직접 변경 : " +  targetDateTime);
			
		targetDateTime = now.withMonth(12);
			System.out.println("직접 변경 : " +  targetDateTime);
			
//			범위 넘어가면
//			Exception in thread "main" java.time.DateTimeException: Invalid value for MonthOfYear (valid values 1 - 12): 2077
//			at java.base/java.time.temporal.ValueRange.checkValidValue(ValueRange.java:319)
//			at java.base/java.time.temporal.ChronoField.checkValidValue(ChronoField.java:717)
//			at java.base/java.time.LocalDate.withMonth(LocalDate.java:1105)
//			at java.base/java.time.LocalDateTime.withMonth(LocalDateTime.java:1007)
//			at sec16.exam04_date_time_change.DateTimeChangeExample.main(DateTimeChangeExample.java:14)
			
			targetDateTime = now
						.withYear(2011)
						.withMonth(11)
						.withDayOfMonth(11)
						.withHour(11)
						.withMinute(11)
						.withSecond(11);
			
				System.out.println("직접 변경 : " +  targetDateTime);	
// 직접변경은 여기까지
			
			
//			상대 변경을 진행해본다.
			
			//년도 상대 변경
			targetDateTime = null;
			targetDateTime =now.with(TemporalAdjusters.firstDayOfYear());
				System.out.println("상대 년도 변경  이번 년도 처음 : " +  targetDateTime);
				
//				???? 2022-01-01T23:03:41.238852 왜 2022냐??
//				응 nextyear넣었어
				
			targetDateTime =now.with(TemporalAdjusters.lastDayOfYear());
				System.out.println("상대 년도 변경 이번 년도 마지막 : " +  targetDateTime);
				
			targetDateTime =now.with(TemporalAdjusters.firstDayOfNextYear());
				System.out.println("상대 년도 변경 다음 년도 처음 : " +  targetDateTime);	
				
				//월 상대 변경
			targetDateTime =now.with(TemporalAdjusters.firstDayOfMonth());
				System.out.println("상대 이번 달 첫 일 : " +  targetDateTime);
				
				
			targetDateTime =now.with(TemporalAdjusters.lastDayOfMonth());
				System.out.println("상대 변경 이번 달의 마지막 : " +  targetDateTime);
				
			targetDateTime =now.with(TemporalAdjusters.firstDayOfNextMonth());
				System.out.println("상대 변경 다음 달의 처음 : " +  targetDateTime);	
				
				
				
				//요일 상대 변경
				targetDateTime =now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
					System.out.println("상대  이번 달의 첫 월요일 : " +  targetDateTime);
					
					
				targetDateTime =now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
					System.out.println("상대 변경 돌아오는 월요일 : " +  targetDateTime);
					
				targetDateTime =now.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
					System.out.println("상대 변경 저번 월요일  : " +  targetDateTime);	
				
	}	

}
