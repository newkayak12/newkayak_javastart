package 확인문제;

public class _7ArrayMaxValue_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max = 0;
		int [] array = {1,5,3,8,2};
		
		for(int i = 0; i< array.length; i++) {
			if(i+1<array.length) {
				if(array[i]>array[i+1]) {
					max = array[i];
					
				} else {
					max = array[i+1];
				}
			}
			
		}
		System.out.println("array 배열의 최대값은 " + max);
		
		///풀이
		int max2 =0;
		for (int i=0; i<array.length; i++) {
			if(max2<array[1]) {
				max=array[i];
			}
		}
		System.out.println("array 배열의 최대값 2는 " + max2);
	}

}
