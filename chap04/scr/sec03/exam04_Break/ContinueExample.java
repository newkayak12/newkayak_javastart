package sec03.exam04_Break;

public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//���ǿ� �ȸ����� continue�� return �� ���� �ֳ�...
		//������� 1~10���� print �ɾ���� �߰��� ����, continue�� ���͸��� �� �ֳ� 
		//�Խ��� ���͸� ���� ������ ���� ��������?
		
		for(int i =1; i<=10; i++) {
			
			if(i%2 != 0) { //if ���ǿ� =�� ���� ������ �ȵǳ� !=�� <=������ ����־�� �ǳ� �̷��� while�� ����.
				continue;
			}
			
			System.out.println(i+"�� ¦���Դϴ�.");
		}
	}

}
