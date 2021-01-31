package sec13.exam01_math_random;

public class MathRandomExample {

	public static void main(String[] args) {
//		Math.random()
		int result = (int)(Math.random()*10)+1;
			System.out.println(result);
			
			int dice = (int)(Math.random()*6)+1;
			System.out.println("dice : " + dice);
			

	}

}
