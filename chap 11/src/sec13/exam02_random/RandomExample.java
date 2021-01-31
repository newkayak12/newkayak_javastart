package sec13.exam02_random;

import java.util.*;

public class RandomExample {

	public static void main(String[] args) {
//		Random 클래스
//		booelan, int, long, float, double의 난수를 얻을 수 있다.
//		난수를 만드는 알고리즘에 사용되는 종자값을 설정할 수 있다. 
//		종자 값이 같으면 같은 난수를 얻는다.
		
		// 메소드 nextBoolean
		// 				nextDouble
		//      		nextInt				(-2의 32승 ~ 2의 32승 -1)
		//				nextInt(int n) (0~n)
		
		
		//
		int[] selectNumber = new int[6];
		Random random = new Random(5);
		System.out.print("선택 번호 : ");
			for(int i = 0; i<6; i++) {
				selectNumber[i]	= random.nextInt(45)+1;
				System.out.print(selectNumber[i]+" ");
			}
			System.out.println();
	
			
			//당첨 번호
			int[] winningNumber = new int[6];
			random = new Random(5);
				System.out.print("당첨 번호 : ");
				for(int i = 0; i<6; i++) {
					winningNumber[i]	= random.nextInt(45)+1;
					System.out.print(winningNumber[i]+" ");
				}
				System.out.println();
		
				
				//배열의 항목을 비교 Arrays.equals();
				
//				오름차순 정렬, 각 항목의 값 비교
				
				Arrays.sort(selectNumber);
				Arrays.sort(winningNumber);
				boolean result = Arrays.equals(selectNumber, winningNumber);
				System.out.println(result);
			
				
				
		
	}

}
