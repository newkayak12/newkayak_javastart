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
		 	
		
		 	System.out.println("사과 한개에서 7조각을 빼면" + result1 +"조각이 남는다."); // 그래서 솔루션으로 정수계산으로 하고 마지막으로 
		 																		// 실수 처리를 해서 출력해라인데... 그냥 부동소수 계산을 개선하는 방법은 없나?
		 																		// 궁금한게 부동소수가 이런 결함이 왜있는지... 궁금하네
		 	                                                                    /* 그리고 부동소수 계산이 해당 실수에 가까운 값(근사치인거지
		 	                                                                     * 딱 그 값이 아니라는 소리고
		 	                                                                     * 마치 lim(a는 0으로 수렴 혹은 무한대) a같은 느낌이네..
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
		 	/*보니까 1~5까지는 0.(1~6)000000000000000|1 이라서 즉, 6~ 에서의 소수 범위 밖이라서 표현이 안되서 정확한 값이 나오는거고 
		 	 *  6~ 는 그게 아니라  　0.6000000000000001 / 0.7000000000000001 값이 표현 범위 안으로 숫자가 올라와서 정확한 값이 계산이 안되는거네
		 	 *  그러면... 부동소수 0.1은 6부터 계산 값이 잘못 출력되게 되는구조...네?
		 	 *  정확한 숫자가 뭘까?
		 	 */                　
	}

}
