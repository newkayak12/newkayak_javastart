package sec01.exam01_variable;

public class C_VariableScopeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int var1;
		
		if(true) {
			int var2;
			
			var1 = 10;
			var2 = 20;
		}
		
			var1 =20;
		//	var2 =30; // ���ο� ���� �����ϸ� �� �ȿ� �߰�ȣ���� ��� ���������� �߰�ȣ �ȿ��� ������ ������ �ش� �߰�ȣ������
			
		for(int i=0; i<1; i++) { //��ü ��Ÿ�� �󸶳� ����ߵ���? ��Ÿ ���� �ؾߵǳ�?
			int var3;
			
			var1 = 10;
			var3 = 20;
		}
		
	}
	

}
