package sec05_try_with_resource;

public class FileInputStream implements AutoCloseable{
	// 파일 입출력 관련 클래스
	
	private String file;
	
	public FileInputStream(String file) {
		this.file=file;
	}
		
	public void read() {
		System.out.println(file + "을 읽습니다.");
	}
	
	
	@Override
	public void close() throws Exception {
		System.out.println(file+"을 닫습니다.");
	}


	//  예외 발생 여부와 상관없이 사용했던 리소스 객체 (각종 입출력 스트림, 서버소켓, 소켓, 각종 채널)의  close()메소드를 호울해서
//	안전하게 리소스를 닫는다.
//		try-with-resource를 사용하려면 java.lang.AutoCloseable을 구현하고 있어야한다. 
		

}
