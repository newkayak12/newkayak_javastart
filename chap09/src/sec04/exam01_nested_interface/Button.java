package sec04.exam01_nested_interface;

public class Button {
 
	interface OnClickListener{
	 void onClick();
	}
	
	OnClickListener listener;
	
	void setOnClickListener( OnClickListener listener) {
		this.listener=listener;
	}
	
	void touch() {
		listener.onClick();
	}
 
}

// 		 구현 객체는 어디서 생성될까? set~(OnClickListener listener)에서 외부에서 만들어진 구현 객체를 받겠지
