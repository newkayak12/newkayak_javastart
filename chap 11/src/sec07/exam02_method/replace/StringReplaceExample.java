package sec07.exam02_method.replace;

public class StringReplaceExample {

	public static void main(String[] args) {
		String oldstr = "자바 프로그래밍";
		String newstr = oldstr.replace("자바","java");
			System.out.println(oldstr);
			System.out.println(newstr);
//		원래 있던 녀석은 수정할 수 없기 때문에 새로 생성해서 반환함
		
	}

}
