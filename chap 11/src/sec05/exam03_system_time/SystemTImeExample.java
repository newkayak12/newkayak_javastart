package sec05.exam03_system_time;

public class SystemTImeExample {

	public static void main(String[] args) {
		long time1 = System.nanoTime();
//		nanotime을 쓰는 이유는 10의 9승 분의 1로 시간을 측정하는데 1부터 100만까지의 합이 빠르게 계산되서  ??? 개소리야...
//		currenttimeMillis는 너무 빨라서 0이 나온다..
		int sum =0;
		for(int i =1; i<=1000000; i++) {
			sum+=i;
		}
		
		
		long time2 = System.nanoTime();
		System.out.println("1~1000000까지의 합 : "+ sum);
		 System.out.println("계산에 "+(time2-time1)+" 나노/초가 소요되었습니다.");
		
	}

}
