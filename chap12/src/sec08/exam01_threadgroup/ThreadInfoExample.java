package sec08.exam01_threadgroup;

import java.util.*;

public class ThreadInfoExample {
	public static void main(String[] args) {
			AutoSaveThread autoSaveThread = new AutoSaveThread();
			autoSaveThread.setName("autoSaveThread");
			autoSaveThread.setDaemon(true);
			autoSaveThread.start();
			
			
			Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();//  스택에 있는 모든 스레드의 정보를 가져옴
			Set<Thread> set = map.keySet();
	
				for( Thread thread : set) {
							System.out.println(thread.getName());
						
							if(thread.isDaemon()) {
								System.out.println("Daemon Thread");
								System.out.println("group : " + thread.getThreadGroup().getName()+"\n");
							} else {
								System.out.println("Main Thread");
								System.out.println("group : " + thread.getThreadGroup().getName()+"\n");
							}
							
							
					// system 아래 main > 		
				}
	}
}
