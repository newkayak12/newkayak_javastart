package lifoNfifo.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messagesQueue = new LinkedList<>();
		messagesQueue.offer(new Message("sndMail", "홍길동"));
		messagesQueue.offer(new Message("sndSMS", "홍갈영"));
		messagesQueue.offer(new Message("sndLine", "김길동"));

		while(!messagesQueue.isEmpty()){
			Message msg = messagesQueue.poll();

			switch (msg.command){
				case "sndMail":
					System.out.println(msg.to+"에게 메일 보냄");
				break;
				case "sndSMS":
					System.out.println(msg.to+"에게 문자 보냄");
				break;
				case "sndLine":
					System.out.println(msg.to+"에게 메신저 보냄");
				break;
			}
		}

	}
}
