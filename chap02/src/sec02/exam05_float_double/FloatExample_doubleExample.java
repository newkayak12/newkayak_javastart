package sec02.exam05_float_double;

public class FloatExample_doubleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�Ǽ��� 3.14 ����?
		double DoubleType= 3.14;
		//float FlotType=3.14;
		float FlotType2=3.14f; //f�� ���̸� 4byte �Ǽ��� ����� (�Ǽ� ���ͷ� �⺻���� double)
		
		//���е� �˻�?
		
		double PrecisionTest_Double=0.1234567890123456789;
		float PrecisionTest_Float=0.1234567890123456789f;
		
		System.out.println(PrecisionTest_Double);
		System.out.println(PrecisionTest_Float);

		/*0.12345678901234568 >double
          0.12345679		  >float �ݿø��ϳ�����? */
		
 //e ���
		int var6=3000000;
		//int var7=3e6; > ������ �־ �ȵ�
		double var7=3e6;
	    float var8=3e6f;
	    double var9=2e-3;
	    
	    System.out.println(var7);
	    System.out.println(var8);
	    System.out.println(var9);
	}

}
