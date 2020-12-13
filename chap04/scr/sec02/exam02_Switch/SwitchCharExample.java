package sec02.exam02_Switch;

public class SwitchCharExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char grade ='b';
		

	switch(grade) {
		case 'A':
		case 'a':
				System.out.println("우수회원입니다."); //char도 가능하고 case 두 개를 붙여서도 사용 가능
				break;
				
		case 'B':
		case 'b':
				System.out.println("일반회원입니다.");
				break;
				
		default :	
				System.out.println("비회원입니다.");
				break;
	}	}
	}

