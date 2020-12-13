package sec03.exam02_While;

public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		boolean run =true;
		int Speed=0;
		int keyCode=0;
		
		while(run) {
			
			if(keyCode!=13 && keyCode!=10) {
				System.out.println("---------------------------------------");
				System.out.println("1. 속도 증가  |  2. 속도 감소  |  3. 중지");
				System.out.println("---------------------------------------");
				System.out.print("선택:"); //system.out.print (ln은 줄을 내림)
				
			} 
			keyCode=System.in.read();
			//System.out.println(keyCode);
if(keyCode ==49) {
	Speed++;
	System.out.println("속도가 증가합니다. 현재 속도는" + Speed +"입니다.");
} else if(keyCode ==50) {
	System.out.println("속도가 감소합니다. 현재 속도는"+ Speed +"입니다.");
} else if (keyCode == 51){
	run =false;
	
	
}
		}
		System.out.println("작동을 중지합니다.");
		} }
