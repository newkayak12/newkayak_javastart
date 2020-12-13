package sec03.exam01_for;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 for(int m=2; m<=9; m++) {
	 System.out.println();
	 System.out.println("****" + m + "단****");
	 System.out.println();
	 for(int x= 1; x<=9; x++){
		 System.out.println(m+"X"+x+"=" + (m*x));
	 }
 }
	}//중첩 for문 m이 한 번 돌때 x는 9번 하는 식으로

}
