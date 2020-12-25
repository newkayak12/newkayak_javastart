package 확인문제;

public class _03_For1To100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드
		
		int sumTri=0;
		int tripleNumber;
		
		for(tripleNumber=1; tripleNumber<=100; tripleNumber++) {
			if(tripleNumber%3 == 0) {
				sumTri += tripleNumber;
		}
			
	}
		System.out.println("3의 배수의 총합은 " + sumTri);
}
	}
