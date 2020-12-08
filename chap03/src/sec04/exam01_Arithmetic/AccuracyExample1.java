package sec04.exam01_Arithmetic;

public class AccuracyExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double result=7*0.1;
		 System.out.println(result);
		 
		 	int apple=1;
		 	double pieceUnit=0.1;
		 	int number=7;
		 	
		 	double result1 = apple-number*pieceUnit;
		 	System.out.println("사과 한개에서 7조각을 빼면" + result1 +"조각이 남는다."); // 부동소수점 때문에 값이 정확하게 표현이 안된다. 
		 																		// 그럼 현업에서 코딩할 때 이런 오류가 발생되면 진짜 골치아프겠네...?
	}

}
