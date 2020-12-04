package sec01.exam01_variable;

public class C_VariableScopeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int var1;
		
		if(true) {
			int var2;
			
			var1 = 10;
			var2 = 20;
		}
		
			var1 =20;
		//	var2 =30; // 메인에 변수 선언하면 그 안에 중괄호에서 사용 가능하지만 중괄호 안에서 선언한 변수는 해당 중괄호까지만
			
		for(int i=0; i<1; i++) { //대체 영타가 얼마나 빨라야되지? 영타 연습 해야되나?
			int var3;
			
			var1 = 10;
			var3 = 20;
		}
		
	}
	

}
