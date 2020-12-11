package exam02_Switch;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num= (int)(Math.random()*6)+1; 
		
		switch(num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		default:
			System.out.println("6번이 나왔습니다.");
			break;
		}
		System.out.println(num); //실험 결과 케이스 이외의 값이 나오면 그냥 default로 감
	}

}
