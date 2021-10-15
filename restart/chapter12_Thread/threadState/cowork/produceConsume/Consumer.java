package threadState.cowork.produceConsume;

public class Consumer extends Thread{
	private DataBox dataBox;


	public Consumer(DataBox dataBox) {
		this.dataBox = dataBox;
	}

	@Override
	public void run() {
		for(int i =1; i<=3; i++){
			String data = dataBox.getData();
		}
	}	
}
