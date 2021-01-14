package sec04_multi_catch;

public class CatchOrderException {

	public static void main(String[] args) {
//		동시에 두 개의 예외 발생 . 예외 처리할 때 1. 해당 예외를 catch에 대입 2. 예외들의 부모클래스인 exception을 지정
//		한 번의 플로우에 한 예외만
		
		
//		상위 클래스인 exception이 다른 에러 catch 보다 상위에 있으면 무조건 exception에 다 빨려들어감 
//		그래서 Exception은 다른 예외들 아래에 놓는게 맞지
//		Exception을 놓는 경우 . 여러 개의 예외 발생 시 특정 예외만 골라서 처리하고 나머지는  Exception에 몰아 넣으려고
		
		
		try {
			String data1 = args[0];
			String data2 = args[1];
//			Arrayindexoutofbounds
			int value1 =Integer.parseInt(data1);
			int value2 =Integer.parseInt(data2);
//			Numberformat
			int result = value1+value2;
			System.out.println(data1 + "+" + data2 + "=" + result	);
		
		
				} catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("실행 매개값 부족");
		
//		
//				} catch(Exception e) {
//					System.out.println("실행 매개값 부족");
//			
//			아래 catch에 (Unreachable catch block for NumberFormatException. It is already handled by the catch block for Exception) 발생
//					즉, 여기에 닿지도 않을 건데 왜 썼냐? 이런거지
//				} catch(NumberFormatException e) {
//					System.out.println("숫자로 변환 불가");
//			
				} catch(Exception e) {
					System.out.println("실행에 문제가 있다");
//					그래서 아래에 Exception을 두면 Array~예외가 아닌 예외는 다 이리로 들어옴
				} finally {
					System.out.println("다시 실행하세요");
				}
		
		
	}

}
