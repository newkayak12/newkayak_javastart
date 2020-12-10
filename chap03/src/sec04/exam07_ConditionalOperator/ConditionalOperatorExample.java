package sec04.exam07_ConditionalOperator;

public class ConditionalOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 조건식(피연산자1, 조건연산자) ? 값 또는 연산식(피연산자2) : 값 또는 연산식(피연산자3) 판단근거 / (true일 경우) /
		 * (false일 경우)
		 */
		 
		
		  //3항연산자로 표현하면
		  int score = 85;
		  char grade = (score>=90)? 'A' :((score>=80)? 'B' : 'C');
		  System.out.println(score + "점은" + grade + "입니다.");
		 
		  
		  //if로 표현하면
		  if(score>=90) {
			 System.out.println(score + "점은 A입니다.");
		 }else {if(score>=80) {
			 System.out.println(score + "점은 B입니다.");
		 }else {
			 System.out.println(score + "점은 C입니다.");
		 }
			 
		 }
	}
	

 }
