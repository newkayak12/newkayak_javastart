package sec06.exam08.advanced_For;

public class AdvancedForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//���� For���̶�...
		/*
		 * for(type Variable : array) {
		 * 
		 * }
		 */
// ������ ���� �迭+for���ٴ� ���ϰ� �� �� �ֳ�
		
		int[] scores= {95,71,84,93,87};
		int sum=0;
		for( int score : scores) { //scores�� �ִ� �ε����� score�� ��ġ�ϴ� �����̰� scores �ε����� ���� ���� ����
			sum +=score;
		}
		System.out.println("�� ���� " +sum);
		double avg = (double) sum /scores.length;
		System.out.println("����� " + avg);
					
	}

}
