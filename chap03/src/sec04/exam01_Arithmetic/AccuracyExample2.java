package sec04.exam01_Arithmetic;

public class AccuracyExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result=7*0.1;
		 System.out.println(result);
		 
		 	int apple=1;
		 	int totalPieces=apple*10;
		 	int number=7;
		 	int temp= totalPieces-number;
		 	
		 	double result1 = temp/10.0;
		 	
		
		 	System.out.println("��� �Ѱ����� 7������ ����" + result1 +"������ ���´�."); // �׷��� �ַ������ ����������� �ϰ� ���������� 
		 																		// �Ǽ� ó���� �ؼ� ����ض��ε�... �׳� �ε��Ҽ� ����� �����ϴ� ����� ����?
		 																		// �ñ��Ѱ� �ε��Ҽ��� �̷� ������ ���ִ���... �ñ��ϳ�
		 	                                                                    /* �׸��� �ε��Ҽ� ����� �ش� �Ǽ��� ����� ��(�ٻ�ġ�ΰ���
		 	                                                                     * �� �� ���� �ƴ϶�� �Ҹ���
		 	                                                                     * ��ġ lim(a�� 0���� ���� Ȥ�� ���Ѵ�) a���� �����̳�..
		 	                                                                     * 
		 	                                                                     */
		 	double testimond=0.1;
		 	int tesit=1;
		 	double tst=testimond*tesit;
		 	double tt=number*tst;
		 	int tesit2=2;
		 	double tt2=testimond*tesit2;
		    int tesit3=6;
		    double tt3=testimond*tesit3;
		    int tesit4=5;
		    double tt4=testimond*tesit4;
		    
		    System.out.println(tt4);
		    System.out.println(tt3);
		 	System.out.println(tt2);   
		 	System.out.println(tt);   
		 	System.out.println(tst);
		 	System.out.println(testimond);
		 	/*���ϱ� 1~5������ 0.(1~6)000000000000000|1 �̶� ��, 6~ ������ �Ҽ� ���� ���̶� ǥ���� �ȵǼ� ��Ȯ�� ���� �����°Ű� 
		 	 *  6~ �� �װ� �ƴ϶�  ��0.6000000000000001 / 0.7000000000000001 ���� ǥ�� ���� ������ ���ڰ� �ö�ͼ� ��Ȯ�� ���� ����� �ȵǴ°ų�
		 	 *  �׷���... �ε��Ҽ� 0.1�� 6���� ��� ���� �߸� ��µǰ� �Ǵ±���...��?
		 	 *  ��Ȯ�� ���ڰ� ����?
		 	 */                ��
	}

}
