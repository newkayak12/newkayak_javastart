package sec04.exam01_Arithmetic;

public class CheckOverflowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int result = left + right; //여기서 left, right는 사용자가 입력한 값이거나 DB에서 불러온 값이거나 외부에서 지정하는 수

		try {
	int result = safeAdd(2000000000, 2000000000);
	System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println("오버플로우가 발생하여 연산할 수 없음.");
			
			
		}
	}

	public static int safeAdd(int left, int right) {
		if(right >0) {
				if(left> (Integer.MAX_VALUE-right)) {
					throw new ArithmeticException("오버플로우 발생");

				}
		}else {
			if(left<(Integer.MIN_VALUE-right)) {
				throw new ArithmeticException("오버플로우 발생");
			
			}
		}
		
		return left + right;
	}
}
