package varify.exam16;

public class Printer {

	int num;
	boolean logic;
	double num2;
	String txt;
	
	public int Println( int num )  {
		this.num=num;
		System.out.println(num);
		return num;
	}
	
	public boolean Println( boolean logic )  {
		this.logic=logic;
		System.out.println(logic);
		return logic;
	}
	
	public double Println( double num2 )  {
		this.num2 = num2;
		System.out.println(num2);
		return num2;
	}
	
	public String Println( String txt )  {
		this.txt=txt;
		System.out.println(txt);
		return txt;
	}
}
