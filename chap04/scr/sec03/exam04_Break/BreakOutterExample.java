package sec03.exam04_Break;

public class BreakOutterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Upper: for(char upper ='A'; upper<='Z'; upper++) {
	for(char lower='a'; lower<='z'; lower++) {
		System.out.println(upper +" : " + lower );
		
		if(lower=='x') { //DowhileExample������ while(!inputString.equals("exit"));�� ���µ� �̷��� �ᵵ �ǳ�??? String�̶� �̷��� ���°ǰ�?
						// �̰� char�� �׳� �����ڵ�� �ԷµǼ� ==�� �ص� �Ǵ°Ű�?
			break Upper;
		}
	}
}
	}

}