package sec04.exam01_Arithmetic;

public class CharOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//����
/* char c1='A'+1;
 * char c2='A';
 * char c3=c2+1; >2����Ʈ ���� +1? 4����Ʈ int�� �ٲ�� ���� 66(int type) > char(2����Ʈ)�� 66(4����Ʈ)�� �����ϸ� ������ �������?
 * char c3=(char) (c2+1); �̷��� 2����Ʈ�� �����ؼ� B�� ����*/
		
		
		char c1='A'+1;
		char c2='A';
		//char c3=c2+1; //����(2����Ʈ->4����Ʈ�� ��ȯ) +1(4����Ʈ) ��� ���� 4����Ʈ, �ٵ� char�� �����ϴϱ� �ڵ忡��
		int result = c2+1;//�̷��� 
		System.out.println(result);
			char c3=(char) result;
		System.out.println(c3); //c3�� �����ڵ�� ��ȯ�ؼ� ���, B�� ����
		System.out.println(c1); //���ͷ��� �����ؼ� char�� �ִ°��� ������ ������, ������ �����ϸ� 4����Ʈ�� �ٲ�
		
		
 

		
		
	}

}
