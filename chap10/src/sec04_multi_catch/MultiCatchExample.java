package sec04_multi_catch;

public class MultiCatchExample {

	public static void main(String[] args) {
//멀티 캐치는 다중 캐치와 비슷하다.
//		사실 거기서 거기인데(의미론적으로)
//			작성 문법이 다르다. 
//		 		java 7부터 바뀌었고 하나의 catch 블록에서 여러 개의 예외를 처리할 수 있다. 

		
//			보니까 
//		 그냥 쓰레기 통 칸을 나눌 수 있게 됐고 거기에 다 때려 박겠다는 소리
//		코드 수는 줄겠지 뭐
		
		
		
		try {
			String data1 = args[0];
			String data2 = args[1];
//			Arrayindexoutofbounds
			int value1 =Integer.parseInt(data1);
			int value2 =Integer.parseInt(data2);
//			Numberformat
			int result = value1+value2;
			System.out.println(data1 + "+" + data2 + "=" + result	);
				} catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
//					근데 이렇게 처리할 수도 있음
					System.out.println("실행 매개값 부족 혹은 숫자로 변환 불가");
//				} catch(NumberFormatException e) {
//					System.out.println("숫자로 변환 불가");
//					이렇게 두 개 놓을 수도 있지
					
				} catch(Exception e) {
					System.out.println("실행  불가");
				} finally {
					System.out.println("다시 실행하세요");
				}
	}

}
