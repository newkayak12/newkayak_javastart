package sec06.exam09.enumeration_type;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Week today = null;
	
	Calendar cal = Calendar.getInstance();
	int week = cal.get(Calendar.DAY_OF_WEEK);
	System.out.println(week);
	
	switch(week) {
	case 1 : today= Week.Sunday;
	break;
	case 2 : today=Week.Monday;
	break;
	case 3 :today= Week.Tuesday;
	break;
	case 4 : today=Week.Wednesday;
	break;
	case 5 :today= Week.Thursday;	
	break;
	case 6 : today=Week.Friday;
	break;
	case 7 :today= Week.Saturday;
	break;
	
		
	}
	System.out.println("������ ������ " + today);
	
	if(today == Week.Sunday) {
		System.out.println("�Ͽ��Ͽ��� �౸�� �մϴ�.");
	}else {System.out.println("������ �ڹ� ���θ� �մϴ�.");
		
	}
	}

}
