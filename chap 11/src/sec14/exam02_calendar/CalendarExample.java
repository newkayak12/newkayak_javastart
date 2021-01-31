package sec14.exam02_calendar;

import java.util.*;

public class CalendarExample {

	public static void main(String[] args) {
		//달력을 표현한 추상 클래스(os를 기반으로한 )
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		System.out.print(year+"-");
		System.out.print(month+"-");
		System.out.print(day+"(");
		
		
		
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		// 상수로 week를 검증??
		//switch를 이용해서 
		
		
		String strWeek = null;
			switch(week) {
				case Calendar.MONDAY:
					strWeek = "월";
					break;
				case Calendar.TUESDAY:
					strWeek = "화";
					break;
				case Calendar.WEDNESDAY:
					strWeek = "수";
					break;
				case Calendar.THURSDAY:
					strWeek = "목";
					break;
				case Calendar.FRIDAY:
					strWeek = "금";
					break;
				case Calendar.SATURDAY:
					strWeek = "토";
					break;
				case Calendar.SUNDAY:
					strWeek = "일";
					break;
				
			}
		
		System.out.println(strWeek+")");
		
		
		
		
		//오전/오후
		int amPm = now .get(Calendar.AM_PM);
		String strAmPm = null;
			if(amPm == Calendar.AM){
				strAmPm = "오전";
				
			} else {
				strAmPm = "오후";
			}
			System.out.print(strAmPm + "  ");
		
			
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		System.out.println(hour + " : " +minute+ " : " +second);
	}
}
