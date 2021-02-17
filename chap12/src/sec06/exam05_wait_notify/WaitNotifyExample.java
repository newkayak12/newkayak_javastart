package sec06.exam05_wait_notify;

public class WaitNotifyExample {

	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		
		ProducerThread pd = new ProducerThread(dataBox);
		ConsumerThread cd = new ConsumerThread(dataBox);
		
		pd .start();
		cd.start();
		
//		Exception in thread "Producer Thread" java.lang.IllegalMonitorStateException
//		at java.base/java.lang.Object.notify(Native Method)
//		at sec06.exam05_wait_notify.DataBox.setData(DataBox.java:39)
//		at sec06.exam05_wait_notify.ProducerThread.run(ProducerThread.java:17)
//	Exception in thread "Consumer Thread" java.lang.IllegalMonitorStateException
//		at java.base/java.lang.Object.notify(Native Method)
//		at sec06.exam05_wait_notify.DataBox.getData(DataBox.java:20)
//		at sec06.exam05_wait_notify.ConsumerThread.run(ConsumerThread.java:15)

		
//		이 예외는 wait / notify를 사용하면 동기화 처리가 필요
		
		
		
		
	}

}
