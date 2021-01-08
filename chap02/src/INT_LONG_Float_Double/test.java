package INT_LONG_Float_Double;

public class test {

	
	int var1=30000000;
	long var2=30000000;
	//int이든 long 이든 int 값 내로 메모리를 할당하면 둘 다 잘 받는다.
	
//	int var3 =10000000000000;
//	long var4 =1000000000000;
	long var5 =10000000000000L;
	//int를 넘어가고 long 범위 안의 값은 long에 'L'을 안 붙이면 에러
	
	int var6=3000000;
	double var7=3000000;
	double var8=3e6;
//	float var9=3e6;
	float var10=3e6f;
	
	double var11=2e-3;
//	float var12=2e-3;
	float var13=2e-3f; 
	// double이 자바 실수 리터럴 기본값이기 때문에 float으로 작성하려면 'f'를 붙여줘야 float으로 인식된다.
	
	
	
	
}
