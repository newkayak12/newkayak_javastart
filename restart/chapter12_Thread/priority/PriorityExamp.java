package priority;
public class PriorityExamp {
	

	public static void main(String[] args) {
		for(int i = 0 ; i<10; i++){
			Thread thread = new CalcThread("thread "+(i+1));

			if(i!=10){
				thread.setPriority(Thread.MIN_PRIORITY);
			} else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			thread.start();
		}

		/*

			thread 8
			thread 9
			thread 5
			thread 2
			thread 1
			thread 4
			thread 10
			thread 7
			thread 3
			thread 6
		
			10이 순서보다 빠르게 생성되었다. 
		*/

	}
}
