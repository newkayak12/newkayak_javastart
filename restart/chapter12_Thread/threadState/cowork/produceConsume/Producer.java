package threadState.cowork.produceConsume;

public class Producer extends Thread{
	private DataBox dataBox;


	public Producer(DataBox dataBox) {
		this.dataBox = dataBox;
	}

	@Override
	public void run() {
		for(int i =1; i<=3; i++){
			String data = "DATA-"+i;
			dataBox.setData(data);
		}
	}	
}
