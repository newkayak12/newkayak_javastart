package exam01_createthread;

import java.awt.*;

public class BeepPrintExample1 {

	public static void main(String[] args) {
//		main method는 jvm이 만든 main thread가 실행
		//비프음을 5번 반복해서 소리나게 하는 작업
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0; i<5; i++) {
					toolkit.beep();
				
				try { Thread.sleep(500);
				//현재 실행하는 쓰레드를 0.5 초 간 슬립상태로 돌입하게 함
				} catch (Exception e) {
					
				}
			
				}
		// 띵! 이라는 문자열을 5번 출력하는 작업
		
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
