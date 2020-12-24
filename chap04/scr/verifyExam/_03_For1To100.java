package verifyExam;

public class _03_For1To100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// for���� �̿��ؼ� 1���� 100������ ���� �߿��� 3�� ����� ������ ���ϴ� �ڵ�
		
		int sumTri=0;
		int tripleNumber;
		
		for(tripleNumber=1; tripleNumber<=100; tripleNumber++) {
			if(tripleNumber%3 == 0) {
				sumTri += tripleNumber;
		}
			
	}
		System.out.println("3�� ����� ������ " + sumTri);
}
	}
