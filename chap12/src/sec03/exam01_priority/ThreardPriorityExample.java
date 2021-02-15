package sec03.exam01_priority;

import sec03.exam01_priority.threads.*;

public class ThreardPriorityExample {

	public static void main(String[] args) {
		for(int i = 1; i<=10; i++) {
				Thread thread = new CalcThread("Thread_"+i);
				
				if(i != 10) {
					thread.setPriority(Thread.MIN_PRIORITY);
				} else {
					thread.setPriority(Thread.MAX_PRIORITY);
				}
				
				
				thread.start();
				
//				Thread_8
//				Thread_2
//				Thread_3
//				Thread_5
//				Thread_6
//				Thread_1
//				Thread_4
//				Thread_7
//				Thread_9
//				Thread_10
//   ?????????????????????????????????????????????????????????????
				
//				Thread_2
//				Thread_10
//				Thread_8
//				Thread_5
//				Thread_9
//				Thread_3
//				Thread_1
//				Thread_7
//				Thread_4
//				Thread_6
// 이게 최대인데?? 왜 최고로 준애가 이렇게 왔다 갔다 하냐?? 스케쥴링 방식이 다른가?
 		}
	}

}
