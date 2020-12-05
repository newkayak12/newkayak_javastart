package sec02.exam05_float_double;

public class FloatExample_doubleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//실수값 3.14 저장?
		double DoubleType= 3.14;
		//float FlotType=3.14;
		float FlotType2=3.14f; //f를 붙이면 4byte 실수로 저장됨 (실수 리터럴 기본값이 double)
		
		//정밀도 검사?
		
		double PrecisionTest_Double=0.1234567890123456789;
		float PrecisionTest_Float=0.1234567890123456789f;
		
		System.out.println(PrecisionTest_Double);
		System.out.println(PrecisionTest_Float);

		/*0.12345678901234568 >double
          0.12345679		  >float 반올림하나보네? */
		
 //e 사용
		int var6=3000000;
		//int var7=3e6; > 가수가 있어서 안됨
		double var7=3e6;
	    float var8=3e6f;
	    double var9=2e-3;
	    
	    System.out.println(var7);
	    System.out.println(var8);
	    System.out.println(var9);
	}

}
