package sec05.exam03_button_event;

public class Window {

	Button button1 = new Button();
	Button button2 = new Button();
//	필드
	
//	방식1. 필드로 선언( 익명 구현 객체)
	
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("calling...");
		}
	};
	
	
//	--------------------------------------------------------------------------------------------------
	Window() {
		button1.setOnClickListener(listener);

//		방식2. 매개변수에 익명 구현 객체 생성
		button2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("messaging...");
			}
		});
//	--------------------------------------------------------------------------------------------------
	}
	
//	생성자 
	
	

	
}
