package sec05.exam03_button_event;

public class Button {
 
	interface OnClickListener{
	 void onClick();
	}
//	중첩인터페이
	OnClickListener listener;
//	필드
	void setOnClickListener( OnClickListener listener) {
		this.listener=listener;
	}
//	메소드에 여러 가지 구현 객체를 넣어서 사용할 수 있다.
	void touch() {
		listener.onClick();
	}
 
}

// 		 구현 객체는 어디서 생성될까? set~(OnClickListener listener)에서 외부에서 만들어진 구현 객체를 받겠지
