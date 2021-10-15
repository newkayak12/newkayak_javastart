package threadState.cowork.produceConsume;

import javax.xml.crypto.Data;

public class WaitNotifyExample {
	public static void main(String[] args) {
		DataBox dataBox = new DataBox();

		Producer producer = new Producer(dataBox);
		Consumer consumer = new Consumer(dataBox);

		producer.start();
		consumer.start();
	}
}

//만들고 쓰고 만들고 쓰고 이렇게 두 개의 쓰레드가 번갈아 움직이게 할 수 있다. notify, wait로 