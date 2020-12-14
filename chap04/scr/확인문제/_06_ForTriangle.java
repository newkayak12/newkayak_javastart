package 확인문제;

public class _06_ForTriangle {
public static void main(String[] args) {
	// 문자를 ++로 증가 시킬 수 있는 게 있으면 좋은데
	// 완전 하드코딩
	int i;
	
	for(i=1; i<=5; i++) {
		switch(i) {
		case 1: System.out.println("*");
		break;
		case 2: System.out.println("**");
		break;
		case 3: System.out.println("***");
		break;
		case 4: System.out.println("****");
		break;
		default : System.out.println("*****");
		break;
			
		// if로 i가 1이면 String starArray = "*"
		// else if로 i가 2면 ...
		// 이거 말고 코드를 더 줄이고 효율적으로 쓰는 법 없나?
		}
			
		
			
	}
}
}
