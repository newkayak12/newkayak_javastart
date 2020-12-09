package sec04.exam03_CompareOperation;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * &&논리곱, ||논리합, ^배타적논리합, !논리부정 논리곱(AND)는 둘 다 true 일 떄 true 논리합(OR)은 둘 중 하나만
		 * true 일 때 true 배타적논리합(XOR)은 둘의 값이 다를 때(true/false, false/true)일 때 true, 둘이 같을
		 * 때(true/true, false/false)일 때 false 논리부정(!)은 boolean값의 반전 !true는 false,
		 * !false는 true
		---------------------------------------------------------------------------------------------------
		&&와 &, ||와 |는 같은 값을 내지만 연산 방식이 다름 &&는 첫번째 값이 true가 아니면 바로 false, true면 그 다음 값을 검사
		&&가 &보다는 빠름 
		||는 앞의 것이 true면 그냥 true처리 그러나 첫번째 값이 false면 |와 같은 연상 방식
		||가 |보다 빠름
		결과적으로 잘 사용은 안한다고 함*/
	
		int charCode = 'A';//A의 유니코드가 저장(65) - int니까
		//int charCode = 'a';
		//int charCode = '7';
		
		
		if((charCode>=65) && (charCode<=90))	{ //65=A
			System.out.println("대문자입니다.");    
			} else 
	        {if((charCode>=97) && (charCode<=122)) { //97=a
			System.out.println("소문자입니다.");
			} else
			{if(!(charCode<48) && !(charCode>57)) { //48=0
			System.out.println("0~9 사이 숫자입니다.");
			} }}
			
			int value = 6;
			int value2 = 11;
			if((value%2 ==0 ) | (value%3==0)) {
				System.out.println("2의 배수이거나 3의 배수입니다.");
			} //앞의 것, 뒤의 것 둘다 봄 true의 경우 (tt,tf,ft)
			
			
			if((value2%2 ==0 ) || (value2%3==0)) {
				System.out.println("2의 배수이거나 3의 배수입니다.");
			}  else{System.out.println("2 또는 3의 배수가 아닙니다.");}//앞의 것이 true면 뒤의 값 조사 안 함 (ft의 경우는 둘 다 봄
			
		
		
	
	}
		}
