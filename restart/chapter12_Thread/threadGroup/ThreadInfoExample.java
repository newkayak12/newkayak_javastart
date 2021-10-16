package threadGroup;

import java.util.Map;
import java.util.Set;

import daemonThread.AutoSaveThread;

public class ThreadInfoExample {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setName("AutoSaveThread");
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();

		Map<Thread,StackTraceElement[]> map = Thread.getAllStackTraces();
		Set<Thread> threads = map.keySet();

		for(Thread thread : threads){
			System.out.println("name : "+thread.getName() + (thread.isDaemon()? "[Daemon]" : "[Main]"));
			System.out.println("\t group : " + thread.getThreadGroup().getName());
			System.out.println();
		}
	}

	/*
	>> system은 jvm
		name : JIT Compilation Thread-004 Suspended[Daemon]
			group : system

		name : IProfiler[Daemon]
			group : system

		name : JIT Compilation Thread-001 Suspended[Daemon]
			group : system

		name : JIT Compilation Thread-002 Suspended[Daemon]
			group : system

		name : GC Worker[Daemon]
			group : system

		name : JIT Compilation Thread-000[Daemon]
			group : system

		name : GC Worker[Daemon]
			group : system

		name : GC Worker[Daemon]
			group : system

		name : JIT-SamplerThread[Daemon]
			group : system

		name : AutoSaveThread[Daemon]
			group : main

		name : JIT Diagnostic Compilation Thread-005 Suspended[Daemon]
			group : system

		name : JIT Compilation Thread-003 Suspended[Daemon]
			group : system

		name : GC Worker[Daemon]
			group : system

		name : GC Worker[Daemon]
			group : system

		name : main[Main]
			group : main

		name : Attach API initializer[Daemon]
			group : main

		name : Concurrent Mark Helper[Daemon]
			group : system

		name : Common-Cleaner[Daemon]
			group : InnocuousThreadGroup


	*/
}
