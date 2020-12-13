package sec02.exam01_If;

public class IfDiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int num =5;

		int num = (int) (Math.random()*6) +1;  //Math라는 클래스 아래에 있는 random 0.0<= Math.random <1.0의 실수를 리턴
		/*
		 * 0<= Math.random <6 여기에 int로 강제 타입변환
 그래서 정수 0~5까지 있는 Math.random이 됨 거기에 +1 해서
		 * 1~6 사이의 수로 만들어줌
		 */
		
if(num ==1) {
	System.out.println("1번이 나왔습니다.");
} else if(num==2) {
	System.out.println("2번이 나왔습니다.");
} else if(num==3) {
	System.out.println("3번이 나왔습니다.");
} else if(num==4) {
	System.out.println("4번이 나왔습니다.");
} else if(num==5) {
	System.out.println("5번이 나왔습니다.");
} else {
	System.out.println("6번이 나왔습니다.");
}

}
}