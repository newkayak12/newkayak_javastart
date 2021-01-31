package sec16.exam02_date_time_info;

import java.time.*;

public class DateTimeInfoExample {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
			System.out.println(now);
		
			
		String strDateTime = now.getYear() + "년 ";
		strDateTime += now.getMonthValue() +"월 ";
		strDateTime += now.getDayOfMonth() +"일 ";
		DayOfWeek dow = now.getDayOfWeek();
		if(dow == DayOfWeek.MONDAY) {
			strDateTime += "월요일 ";
		}  else if(dow == DayOfWeek.FRIDAY) {
			strDateTime += "금요일 ";
		} else if(dow == DayOfWeek.SUNDAY) {
			strDateTime += "일요일 ";
		}
		
		strDateTime += now.getHour() + " 시 ";
		strDateTime += now.getMinute() + " 분 ";
		strDateTime += now.getSecond()  + " 초 ";
		strDateTime += now.getNano() + " 나노 초 ";
		
			System.out.println(strDateTime);
		
		
			
//			윤년?
//			(isLeapYear는 LocalDate에만 있다. )
			LocalDate nowDate = now.toLocalDate();
				if( nowDate.isLeapYear()) {
					System.out.println("올해는 2월에 29일까지 있습니다.");
				} else {
					System.out.println("올해는 2월에 28일까지 있습니다.");
				}
				
				
				ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
					System.out.println("협정 세계시 :  " + utcDateTime.toString());
//				협정 세계시 :  2021-01-31T13:48:40.584222   Z(zoneoffset ) [UTC](zoneid)
				
				ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
					System.out.println("seoul : " + seoulDateTime);
					
				ZoneId seouldZoneId = seoulDateTime.getZone();
					System.out.println("seoul zone id : " +  seouldZoneId);
					
				ZoneOffset seoulZonOffset = seoulDateTime.getOffset();
					System.out.println(seoulZonOffset);
	}

}
