package sec08.exam01_method_declarartion;

public class Computer {
public int sum1(int[] values) {
	int sum=0;
	for(int i =0; i<values.length; i++) {
	sum += values[i];
	
	}
	return sum; 
}

public int sum2(int ... values) { //얘도 배열로 생각하고 사용하면 된다. 배열쪽 복습 한 번 다시 해야겠네
	int sum =0;
	for(int i =0; i<values.length; i++) {
		sum += values[i];
	}
	
	return sum;
}
}
