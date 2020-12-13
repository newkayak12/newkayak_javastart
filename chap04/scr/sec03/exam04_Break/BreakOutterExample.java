package sec03.exam04_Break;

public class BreakOutterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Upper: for(char upper ='A'; upper<='Z'; upper++) {
	for(char lower='a'; lower<='z'; lower++) {
		System.out.println(upper +" : " + lower );
		
		if(lower=='x') { //DowhileExample에서는 while(!inputString.equals("exit"));로 썻는데 이렇게 써도 되나??? String이라 이렇게 쓰는건가?
						// 이건 char라서 그냥 유니코드로 입력되서 ==로 해도 되는거고?
			break Upper;
		}
	}
}
	}

}