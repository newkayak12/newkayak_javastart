package sec06.exam03_Array_Length;

public class ArrayLengthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//�迭�� ���̴� �б� �����̱� ������ intArray.length = 10;���� �����ϴ� ���� �Ұ���
		// for���� �� �� �ݺ����� ������ �� ���� ���
		int[] scores = {83,90,87};
		int sum=0;
		for(int i =0; i<scores.length; i++) { //length�� �迭�� �ʵ�(���̳��ʵ�) �� �� ���� ����Ǹ� ������ �ȵ� :�б�����
			sum += scores[i];
		}
		System.out.println("���� "+ sum);
		double avg= (double)sum / scores.length;//���� ������ ���� �ʰ� length�� ��
		System.out.println("��� " + avg);
	}

}
