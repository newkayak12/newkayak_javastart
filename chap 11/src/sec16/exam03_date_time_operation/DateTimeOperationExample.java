package sec16.exam03_date_time_operation;

import java.time.*;

public class DateTimeOperationExample {

	public static void main(String[] args) {
		LocalDateTime now =LocalDateTime.now();
			System.out.println("now \n" + now);
			
		LocalDateTime targetDateTime = now.plusYears(1);
			System.out.println("+1 year\n" + targetDateTime);
			
		targetDateTime = targetDateTime.plusMonths(2);
			System.out.println("+2 month\n" + targetDateTime);
			
		targetDateTime = targetDateTime.plusDays(3);
			System.out.println("+3 day \n" + targetDateTime);
			
		targetDateTime = targetDateTime.plusHours(4);
			System.out.println("+4 hour \n" + targetDateTime);
			
		targetDateTime = targetDateTime.minusMinutes(5);
			System.out.println("-5 minutes\n" + targetDateTime);
			
		targetDateTime = targetDateTime.minusSeconds(6);
			System.out.println("-6 seconds\n" + targetDateTime);
			
			
			//전부다 localDateTime을 리턴
			//간단하게??
			
			
			LocalDateTime second = LocalDateTime.now();
			
			LocalDateTime secondTarget = now
					.plusYears(1)
					.plusMonths(2)
					.plusDays(3)
					.plusHours(4)
					.minusMinutes(5)
					.minusSeconds(6);
			
//			이렇게도 가능하네 ㅋㅋㅋㅋㅋ
			System.out.println(secondTarget);
	}

}
