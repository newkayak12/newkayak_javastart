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
	System.out.println("");
	
	for (int q =1; q<=5; q++) {
		for(int j=1; j<=q; j++) {
			System.out.print("*");
		if(j==q) {
			System.out.println();}
		//print로 그냥 별을 찍기만 하는거고 행 내리는거는 ln으로 내렸네
		// 별을 늘릴 생각이 아니라 별 하나씩 찍는데 그걸 늘리고 내린다는 생각을 했어야 됐네...
		}
	}
}
}
