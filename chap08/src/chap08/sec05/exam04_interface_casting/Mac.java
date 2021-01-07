package chap08.sec05.exam04_interface_casting;

public class Mac implements Unix{
		
	 
	 
	 public void checkIO() {
		 System.out.println("checking i/o interface");
	 }

	@Override
	public void run() {
System.out.println("os running");		
	}
}
