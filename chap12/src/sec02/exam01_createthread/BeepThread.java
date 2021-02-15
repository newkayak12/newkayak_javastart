package sec02.exam01_createthread;

import java.awt.*;

public class BeepThread extends Thread  {
		@Override
		public void run() {
			
			Toolkit tool = Toolkit.getDefaultToolkit();
			
				for(int i=0; i< 5; i++) {
					tool.beep();
					
					try {
							Thread thread = new Thread();
							thread.sleep(500);
					} catch (Exception e) {
					
					
					}
				}
			
			
		}
}
