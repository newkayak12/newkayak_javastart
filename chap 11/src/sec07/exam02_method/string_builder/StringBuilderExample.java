package sec07.exam02_method.string_builder;

public class StringBuilderExample {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		sb.append("java");
		sb.append(" program study");
			System.out.println(sb.toString());
		
			//삽입
		sb.insert(4, "2");
			System.out.println(sb.toString());
			
			//특정위치 문자 변경
		sb.setCharAt(4, '6');
			System.out.println(sb.toString());
		
		
			//범위 문자 대체
		sb.replace(6, 13, "book");
			System.out.println(sb.toString());
			
			//삭제
		sb.delete(4, 5);
			System.out.println(sb.toString());
			
		int length = sb.length();
			System.out.println(length);
//			" "도 포함해서 
			
			//빌더 내용을 확정
		String result = sb.toString();
			System.out.println(result);
	}

}
