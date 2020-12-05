package sec03.exam01_Promotion;


public class PromotionExample {
	
	 	public static void main(String[] args) {
	int intV1=200;
	double doublev= intV1;
	
	char charval = 'A';
	int intVal2=charval;

	//예외
	byte bytev=65;
	// char charv=bytev; //안됨
	char charv2=(char) bytev;
	
	System.out.println(bytev);
	System.out.println(intVal2); //The method Println(int) is undefined for the type PrintStream 에러가 나네? 근데 ctrl+space로 int프린트로 지정하니까 뜨긴하네?
	System.out.println(charv2); //"
	
	int inttest= 65;
	char chartest= (char)inttest;
	System.out.println("int를 char로" + '\t'+"=" + chartest);
	
	//강의내용
	
	byte byteValue =10;
	int intValue=byteValue; //1바이트를 4바이트로 변환
	System.out.println(intValue);
	
	char charValue='가';
	int intValue2= charValue; //유니코드 값 산출 _ 이걸로 색깔 유니코드 뽑아내는거 만들어 볼 수도 있으려나?
	System.out.println(intValue2);
	
	int intValue3=500;
	long longValue=intValue3; // 4 to 8

	System.out.println(longValue); 
	
	int intValue4 = 200;
	double doubleValue = intValue4;
	System.out.println(doubleValue); //4 to 8(실수)
	
	long longvalue2 =100000000000L;
	float floatValue=longvalue2;
	System.out.println(floatValue); //long(8) to 4(float) 부동소수점 방식으로 표현, 가수와 지수로 저장되기 때문에 더 효율적으로 수를 많이 표현 할 수 있음
	

	 		int intv123=128;
	 		byte bytev123= (byte) intv123; 
	 		System.out.println(bytev123); //129 byte 범위 -128~127을 넘어가서(0은 양수에 포함되서 128이 아니다.) -128로 표현됨 > 강제로 변환하면 값이 달라질 수 있으니 값을 보존하면서 진행해야한다. 그럼 굳이.. 바꿀필요있음?
	 									// 만약 강제로 바꿔야하는데 이런 에러나면 바꿀 수 있는 다른 방법이 있음? 없을 것 같은데?
	 									// 옛날 게임에서 어느 범위 이상으로 돈이나 업그레이드가 넘어가면 갑자기 마이너스나 0으로 되는 이유인 것 같다. 
	 		
	 		
	 		/* 4바이트는 |ㅁㅁㅁㅁㅁㅁㅁㅁ|ㅁㅁㅁㅁㅁㅁㅁㅁ|ㅁㅁㅁㅁㅁㅁㅁㅁ|ㅁㅁㅁㅁㅁㅁㅁㅁ| 이런식인데 이걸 1바이트로 강제로 집어 넣으면 맨 뒤 |ㅁㅁㅁㅁㅁㅁㅁㅁ|만 떼어서 1바이트 포맷으로 저장 */
	 		
	 		double doubletye=3.14;
	 		int intel =(int) doubletye;
	 		System.out.println(intel);
	 		
	 		
	 		/*  만약 사용자가 int i= '?'; '?'에 해당하는 값을 넣어야하고
	 		 * byte b =(byte) i;라면 값이 원래랑 달라질 수 있음
	 		 * 그래서 그 사이에 검사하는 단계를 집어넣는다고 함 */
	 		
	       /*if((i<Byte.MIN_VALUE) || (i>Byte.MAX.VALUE) {
	        * System.out.println("byte 타입으로 변환할 수 없습니다.");
	        * System.out.println("값을 다시 확인해주세요.");
	        * } else{
	        * byte b = (byte)i;
	        * System.out.println(b);
	        * 
	        * 이렇게 쓸 수 있음 if 문으로 바이트 최소&최대값 상수를 사용해서 검사하고 그 안이면 else를 실행
	        
	        *가끔 인터넷 홈페이지에 숫자만 써야하는 곳에 실수로 다른 문자 쓰면 디나이되던데 이걸로 구현할 수 있을것 같네?
	        */
	 		 
	 		
	 		
	 	}


}