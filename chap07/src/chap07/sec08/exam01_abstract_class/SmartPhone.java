package chap07.sec08.exam01_abstract_class;

public class SmartPhone extends Phone{
	public SmartPhone( String owner ) {
		super( owner );
	}
	
		public void internetSearch() {
			System.out.println("searching Internet");
		}
		
}
