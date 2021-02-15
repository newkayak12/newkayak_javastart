package sec02.exam01_createthread;

import java.awt.*;

public class BeepPrintExample2 {

	public static void main(String[] args) {
//		main method는 jvm이 만든 main thread가 실행
		//비프음을 5번 반복해서 소리나게 하는 작업
	//********************** 1번째 방법	
//			Runnable beepTask = new BeepTask();
//			// Runnable로 task 객체 만들고
//	
//			
//			Thread thread = new Thread(beepTask);
//			// Thread로 받아서 선언
//			
//			
//			thread.start(); 
////		새로운 스레드 시작			
			
//  *************************2 번쨰 방법 : 익명 구현 객체
//		Thread thread = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				
//						for( int i = 0; i< 5; i++) {
//							toolkit.beep();
//							
//							
//								try {Thread.sleep(500);
//								
//								} catch (Exception e) {
//									
//								}
//						}
//			}
//			
//		});
//		
//		thread.start();
//		
		
		
//		 ***************************3번째 방법 : 람다식 > 이렇게 하면 Runnable이 알아서 구현
		Thread thread = new Thread(() -> { 
			
			Toolkit toolkit = Toolkit.getDefaultToolkit();
						for( int i = 0; i< 5; i++) {
							toolkit.beep();
							
							
								try {Thread.sleep(500);
								
								} catch (Exception e) {
									
								}
						}
			
			
		}  );
		
		thread.start();
		
///////////////////////이렇게 동시에 무언가를 해야한다면  쓰레드를 생성해서 작업을 나눈다. 			
			
				for(int i = 0; i<5; i++) {
					System.out.println("beep!");
				try { Thread.sleep(500);
				//현재 실행하는 쓰레드를 0.5 초 간 슬립상태로 돌입하게 함
				} catch (Exception e) {
					
				}
			
				}
				
			// 동시에 나오길 바랬는데..... 안됐습니다.
			// 멀티스레드 처리를 해야지!
				
	}

}
