package sec15.exam02_simpledataformat;

import java.text.*;
import java.util.*;

public class SimpleDateFormatExample {

	public static void main(String[] args) {
		Date date = new Date();
		
		SimpleDateFormat sdf  = new SimpleDateFormat("yyyy - MM - dd");
			System.out.println(sdf.format(date));
		
			SimpleDateFormat sdf2  = new SimpleDateFormat("yyyy 년  MM 월  dd 일");
			System.out.println(sdf2.format(date));
			
			SimpleDateFormat sdf3  = new SimpleDateFormat("yyyy 년  MM 월  dd 일 a HH:mm:ss");
			System.out.println(sdf3.format(date));
			
			
			SimpleDateFormat sdf4  = new SimpleDateFormat("오늘은 E요일");
			System.out.println(sdf4.format(date));
			
			SimpleDateFormat sdf5  = new SimpleDateFormat("올해의 D번쨰 날");
			System.out.println(sdf5.format(date));
			
			SimpleDateFormat sdf6  = new SimpleDateFormat("이 달의 d 번째 날");
			System.out.println(sdf6.format(date));
		
	}

}
