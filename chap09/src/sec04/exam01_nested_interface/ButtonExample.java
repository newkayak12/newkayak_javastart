package sec04.exam01_nested_interface;

public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener());
		btn.touch();
//		여기에 객체가 구현됨
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
//		다른 객체를 구현함
		
		btn.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Take a photo");
			}
		});
		
		btn.touch();
		
//		익명구현 객체로 만드는 방법 
		
//		왜 UI에서 이렇게 쓴다는지 조금은 이해가 갈 듯도 하네 
	}

}
