package sec08.exam01_method_declarartion;

public class Computer {
public int sum1(int[] values) {
	int sum=0;
	for(int i =0; i<values.length; i++) {
	sum += values[i];
	
	}
	return sum; 
}

public int sum2(int ... values) { //�굵 �迭�� �����ϰ� ����ϸ� �ȴ�. �迭�� ���� �� �� �ٽ� �ؾ߰ڳ�
	int sum =0;
	for(int i =0; i<values.length; i++) {
		sum += values[i];
	}
	
	return sum;
}
}
