package sec15.exam03_messageformat;

import java.text.*;

public class MessageFormatExample {

	public static void main(String[] args) {
		
		String id = "java";
		String name = "kim sang hyeon";
		String tel = "010-1234-4321";
		
		String text = "id : java \n name : Kim SangHyeon \n tel : 010-1234-4321";
		
		
		//데이터 동적 처리할 떄??
		
		String textDynamic = "\n id : {0} \nname : {1} \ntel : {2}";
		String result1 = MessageFormat.format(text, id, name, tel);
		
//		이러면 완성된 문자열을 리턴
		
		System.out.println(result1);
		
		
		
		
//		db에서 사용하는 sql??
		System.out.println();
		String sql = "insert into member values( {0}, {1}, {2})";
		Object[] arguments = {"java","kim","010-1234-4312"};
		String result2 = MessageFormat.format(sql, arguments);
			System.out.println(result2);
		
			
//			sql은 데이터 베이스 포로그래밍을 사용할 때 사용
			
	}

}
