package sec06.exam08.advanced_For;

public class AdvancedForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//향상된 For문이라...
		/*
		 * for(type Variable : array) {
		 * 
		 * }
		 */
// 예전에 쓰던 배열+for보다는 편하게 쓸 수 있네
		
		int[] scores= {95,71,84,93,87};
		int sum=0;
		for( int score : scores) { //scores에 있는 인덱스를 score로 대치하는 느낌이고 scores 인덱스가 없을 때가 도네
			sum +=score;
		}
		System.out.println("총 점은 " +sum);
		double avg = (double) sum /scores.length;
		System.out.println("평균은 " + avg);
					
	}

}
