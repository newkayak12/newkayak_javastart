package sec16.exam05_date_time_compare;

import java.time.*;
import java.time.temporal.*;

public class DateTimeCompareExample {

	public static void main(String[] args) {
		LocalDateTime startDateTime = LocalDateTime.of(2023,1,1,9,0,0);
			System.out.println("Start Date : " +startDateTime );
			
		LocalDateTime endDateTime = LocalDateTime.of(2024,3,31,18,0,0);
			System.out.println("End Date   : " +endDateTime+"\n");
			
			
//		startDateTime = LocalDateTime.of(2024,3,31,18,0,0);
//		startDateTime = LocalDateTime.of(2024,5,31,18,0,0);	
			
			if(startDateTime.isBefore(endDateTime)) {
					System.out.println("진행 중입니다. \n");
			} else if (startDateTime.isEqual(endDateTime)) {
					System.out.println("같은 시간입니다. \n");
			} else if ( startDateTime.isAfter(endDateTime)) {
					System.out.println("지나갔습니다. \n");
			}
			
			
			long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
				System.out.println(" [ 종료까지 남은 년 ] : " + remainYear);
			
			long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
				System.out.println(" [ 종료까지 남은 달 ] : " + remainMonth);
			
			long remainDays = startDateTime.until(endDateTime, ChronoUnit.DAYS);
				System.out.println(" [ 종료까지 남은 날 ] : " + remainDays);
				
			long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
				System.out.println(" [ 종료까지 남은 시 ] : " + remainHour);
				
			long remainMinutes = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
				System.out.println(" [ 종료까지 남은 분 ] : " + remainMinutes);
				
			long remainSecond = startDateTime.until(endDateTime, ChronoUnit.SECONDS);
				System.out.println(" [ 종료까지 남은 초 ] : " + remainSecond);
				
				
			remainDays = ChronoUnit.YEARS.between(startDateTime, endDateTime);
				System.out.println(" 남은 해 " +  remainYear);
			remainMonth = ChronoUnit.MONTHS.between(startDateTime, endDateTime);
				System.out.println(" [ 종료까지 남은 달 ] : " + remainMonth);
			remainDays = ChronoUnit.DAYS.between(startDateTime, endDateTime);
				System.out.println(" [ 종료까지 남은 날 ] : " + remainDays);
			 remainHour = ChronoUnit.DAYS.between(startDateTime, endDateTime);
				System.out.println(" [ 종료까지 남은 시 ] : " + remainHour);
			remainMinutes = ChronoUnit.MINUTES.between(startDateTime, endDateTime);
				System.out.println(" [ 종료까지 남은 분 ] : " + remainMinutes);
			 remainSecond = ChronoUnit.SECONDS.between(startDateTime, endDateTime);
			 	System.out.println(" [ 종료까지 남은 초 ] : " + remainSecond+"\n");
			 	
			 	
			 	
			 	
//			 	period에도 between이 있다.
		 	Period period = Period.between(startDateTime.toLocalDate(), endDateTime.toLocalDate());
		 		System.out.print(period.getYears()+"년 ");
		 		System.out.print(period.getMonths()+"달 ");
		 		System.out.println(period.getDays()+"일");
		 		
		 		
		 		
//		 		duration
		 		
	 		Duration duration = Duration.between(startDateTime.toLocalTime(), endDateTime.toLocalTime());
		 		System.out.println("남은 시 : " + duration.toHours());
		 		System.out.println("남은 분 : " + duration.toMinutes());
		 		System.out.println("남은 초 : " + duration.toSeconds());
		 		
//		 		System.out.println("남은 초 : " + duration.getSeconds());
				 	
	}

}
