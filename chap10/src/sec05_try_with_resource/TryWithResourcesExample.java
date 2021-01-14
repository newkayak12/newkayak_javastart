package sec05_try_with_resource;

public class TryWithResourcesExample {

	public static void main(String[] args) {

		try(FileInputStream fis = new FileInputStream("file.txt")) {
//			강제로 예외 발생 
				fis.read();

				throw new Exception();
//				예외 발생 코드임 위의 것이
				
				
		} catch(Exception e) {
			System.out.println("예외 처리 코드 실행");
		}
	
	
//	오라클 자바 문서에 보면  각종 입출력 스트림, 서버소켓, 소켓, 각종 채널에서 autoclosable이 구현되어 있다는 것을 확인할 수 있다. 
	
	}

}
