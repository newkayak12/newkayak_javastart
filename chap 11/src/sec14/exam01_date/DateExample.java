package sec14.exam01_date;

import java.text.*;
import java.util.*;

public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		
			String strNow = now.toString();
			System.out.println(strNow);
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	String strNo2 = sdf.format(now);
	System.out.println(strNo2);
	
	}

}
