package 확인문제;

public class _8_ArrayValueSumAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] array= {{95,86},{83,92,96},{78,83,93,87,88}};
int sum = 0;
double avg = 0.0;
int avgnum =0;

for(int i=0; i<array.length; i++ ) {
	for(int k=0; k<array[i].length; k++) {
		sum += array[i][k];
 				
	}
	avgnum += array[i].length;
}
System.out.println("array 배열의 총 합은 " + sum);
avg = (double) sum/ avgnum;
System.out.println("array 배열의 평균 값은 " +  avg);
	}

}
