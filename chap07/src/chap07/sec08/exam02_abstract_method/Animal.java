package chap07.sec08.exam02_abstract_method;

public abstract class Animal {

		public String kind;
		
		public void breathe() {
			System.out.println("inhale");
			System.out.println("exhale");
		}
		
		public abstract void growl();
}
