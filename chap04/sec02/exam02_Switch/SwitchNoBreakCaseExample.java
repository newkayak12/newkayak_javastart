package exam02_Switch;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int time = (int)(Math.random()*4)+8;
		
		System.out.println("[현재 시간: " +time+ "시]");
		
		switch(time) {
			case 8:
					System.out.println("출근합니다.");
			case 9:
					System.out.println("회의를 시작합니다.");
			case 10:
					System.out.println("업무를 시작합니다.");
			default:
					System.out.println("외근을 시작합니다."); //case 뒤에 break;가 없으면 어떻게 될까요?
		}
	}

}
