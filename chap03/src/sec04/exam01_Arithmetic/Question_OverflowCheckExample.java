package sec04.exam01_Arithmetic;

public class Question_OverflowCheckExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	//safeAdd 메소드 실행
	int result= safeAdd(2000000000,2000000000);
	System.out.println(result);
} catch(ArithmeticException e) {
	System.out.println("오버플로우");
}
}
	
	//safeAdd 메소드 작성
	public static int safeAdd(int left, int right) {
		if((right>0)) {
			if(left>(Integer.MAX_VALUE-right)) { /*left>(Integer.MAX_VALUE-right)를 수학적으로 정리하면 
				                                   left+right>Integer.MAX_VALUE인데 왜 굳이 저렇게 쓴거야? 어차피 두번째 식처럼 써도 상관없는거 아님?
				                                   굳이 한번 더 생각하게 이렇게 쓴걸까? 이유가 있나? 
				                                   솔직히 진짜 이해안가네... 	*/ 
				throw new ArithmeticException("오버플로우 발생");
			}
			
		}else {
			if(left<(Integer.MIN_VALUE-right)) {
				throw new ArithmeticException("오버플로우 발생");
				
			}
		}
	return left + right;
	}
	

}
