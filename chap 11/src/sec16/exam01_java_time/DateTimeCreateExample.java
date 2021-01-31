package sec16.exam01_java_time;

import java.time.*;
import java.time.temporal.*;

public class DateTimeCreateExample  {

	public static void main(String[] args) throws InterruptedException {
		//날짜 얻기
		LocalDate currDate = LocalDate.now();
			System.out.println("현재 날짜 : " + currDate.toString());
			
		LocalDate targetDate = LocalDate.of(2077, 5, 10);
			System.out.println("target date : "+ targetDate);
			
			//시간 얻기
		LocalTime currTime = LocalTime.now();
			System.out.println("현재 시간 : " +currTime);
		LocalTime targetTIme = LocalTime.of(5, 30,0,0);
			System.out.println("target time : "+ targetTIme);
			
			
			
			//날짜/시간을 동시에
		LocalDateTime currDateTime = LocalDateTime.now();
			System.out.println("현재 날짜와 시간 : "+ currDateTime.toString());
		
		LocalDateTime targetDateTime = LocalDateTime.of(2077, 7,12,6,24,23,488);
			System.out.println("target date and time "+ targetDateTime);
			
			
			//협정 세계시(UTC)와 시간존(그리니치)
			ZonedDateTime utcDateTIme = ZonedDateTime.now(ZoneId.of("UTC")	);
				System.out.println(utcDateTIme);
			ZonedDateTime newyorkDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
//			String[] availableIDs = TimeZone.getAvailableIDs();
//			
//				for(String zoneId : availableIDs) {
//					System.out.println(zoneId);
//				}
			
			ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
			
			
			//특정 시점의 타임스탬프??
			// 타임 스탬프 = 현재 시점의 시간을 도장찍듯이 찍는다. 
			// 가입날짜 등을 출력할 때....
			Instant instant1 = Instant.now();
			
			Thread.sleep(10);
			
			Instant instant2 = Instant.now();
			
			if(instant1.isBefore(instant2)) {
				System.out.println("instant1 is faster than instant2");
			} else if(instant1.isAfter(instant2)) {
				System.out.println("instant1 is slower than instant2");
			}  else {
				System.out.println("same time");
			}
			
			System.out.println("gap(nano/sec)"+ instant1.until(instant2, ChronoUnit.NANOS));
				
	}

}
