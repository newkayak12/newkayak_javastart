package chap08.sec05.exam04_interface_casting;

public class UnixExample {

	public static void main(String[] args) {
		Unix unix = new Mac();
		
		unix.run();
		Mac mac = (Mac) unix;
		
		mac.checkIO();
		mac.run();
	}

}
