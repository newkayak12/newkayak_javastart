package sec04_multi_catch;

public class CatchByExceptionKindExample {

	public static void main(String[] args) {
			try {
		String data1 = args[0];
		String data2 = args[1];
//		Arrayindexoutofbounds
		int value1 =Integer.parseInt(data1);
		int value2 =Integer.parseInt(data2);
//		Numberformat
		int result = value1+value2;
		System.out.println(data1 + "+" + data2 + "=" + result	);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("실행 매개값 부족");
			} catch(NumberFormatException e) {
				System.out.println("숫자로 변환 불가");
			} finally {
				System.out.println("다시 실행하세요");
			}
//		이 둘을 따로 따로 처리
//			예외별로 catch를 작성해서 따로따로 처리할 수 있음
			
	}

}
