package sec07.exam02_method.indexof;

public class StringIndexOfExample {

	public static void main(String[] args) {
//		주어진 문자열이 포함되어있지 않으면 -1 리턴
		String subject = "자바 프로그래밍";
		int location = subject.indexOf("프로그래밍");
		
			System.out.println(location);  // 시작 위치 반환
		
		if(subject.indexOf("자바") != -1) {
				System.out.println("java is included");
		} else {
				System.out.println("java is not included");
		}

	
	
	}

}
