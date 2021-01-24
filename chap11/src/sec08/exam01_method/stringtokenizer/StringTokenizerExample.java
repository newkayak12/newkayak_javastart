package sec08.exam01_method.stringtokenizer;

import java.util.*;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String text = "김민지/이진주/박민지";
		
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens();
			System.out.println(countTokens);
			for (int i =0; i<countTokens; i++) {
				String token = st.nextToken();
					System.out.println(token);
			}
				
//		보통 이렇게는 안한다. 새롭게 new StringTokenizer 하고 nextToken해서 하나씩 뽑아내는 식으로 사용
			
			
		st = new StringTokenizer(text, "/");
		
			while(st.hasMoreTokens()) {
				String token = st.nextToken();
				System.out.println(token);
			}
				
			
// 두 번째가 더 일반적으로 사용하는 StringTokenizer			
			
	}

}
