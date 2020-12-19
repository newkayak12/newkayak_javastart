package sec06.exam09.enumeration_type;

public class EnumMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Week today = Week.Sunday;
String name = today.name(); //여기에 today는 왜 소문자고 Week는 왜 대문자냐  아!.. 잠깐만 Week에 today 선언했고 그걸 Week.sunday로 대입했지
							// 그리고 String 참조객체에 name선언하고 today 변수의 .name()을 실행한거니까 소문자가 맞지 
System.out.println(name);

int ordianl = today.ordinal();
System.out.println(ordianl);
// 객체, 상수, 변수, 메소드, 클래스 같은 용어의 정의가 확실하지 않으니까 이해하기가 어렵네
Week day1 = Week.Monday;
Week day2 = Week.Wednesday;
int result1= day1.compareTo(day2), result2 = day2.compareTo(day1);
System.out.println(result1);
System.out.println(result2);

Week weekDay = Week.valueOf("Sunday"); //Sunday와 같은 문자열의 열거 번지를 return
if(weekDay == Week.Sunday || weekDay==Week.Saturday) {// 열거 상수 객체의 번지와 weekDay의 참조 번지가 같은가?
	System.out.println("주말");
}else {System.out.println("평일");
	
}

Week[] days = Week.values();//열거 객체의 배열을 return
/*
 * System.out.println(days[0]);
 *  System.out.println(days[6]);
 */


//실제로 이게 어떻게 쓰일까? 달력프로그램?

for(Week day : days) {//for(새로운 변수 : 기존에 배열을 갖고 있는 변수) 그러면 for를 돌면서 week에 각 위치를 대입// days의 배열이 끝나면 for문이 끝
	System.out.println(day );
}
	}

}
