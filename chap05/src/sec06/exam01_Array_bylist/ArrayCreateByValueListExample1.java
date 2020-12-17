package sec06.exam01_Array_bylist;

public class ArrayCreateByValueListExample1 {
public static void main(String[] args) {
	
	int scores[]= {83, 90, 87}; //scores는 스택 {}는 힙 영역에 형성, 인덱스 0,1,2 마다 83 90 87
	System.out.println("scores[0]은 " + scores[0]);
	System.out.println("scores[1]은 " + scores[1]);
	System.out.println("scores[2]은 " + scores[2]);
	
	int sum = 0;
	for(int i=0; i<=2; i++) {
		sum += scores[i];
		
	}
	System.out.println("총합은 " +sum);
	double avg = (double) sum/ 3;
	System.out.println("평균은 " +avg);
}
}
