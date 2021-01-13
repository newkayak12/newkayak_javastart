package verify.pro06;

public class Chatting {

	void startChat ( String chatId ) {
		 final String nickName = chatId;
		
		Chat chat = new Chat() {
			@Override
			void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = " [ " + nickName + "]" +inputData;
					sendMessage(message);
				}
			}
		};
			chat.start();
	}
		
}
//	메소드가 끝나면 로컬 변수는 스택에서 사라지고 객체는 힙에 저장되어서 지속적으로 사용되는데 
// 여기서 로컬 변수가 사라지면 해당 익명 구현 객체가 제 구실을 못해서 문제가 되는 것 
//  로컬 변수에 final을 선언해주면 됨


// 혹은 자바 7부터 그냥 final 특셩을 받으니까 final은 생성과 동시에 초기화를 해야함 그래서 
// String nickName = null;
// nickName = chatId; 를
//String nickName = chatId;로 바꿔서 final 특성이 작동하게 해주면 됨

	class Chat {
	void start() {}
	void sendMessage(String message) {}
	}

