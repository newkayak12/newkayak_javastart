package sec10.exam02_static_block;

public class Television {

	
	static String company = "Apple";
	static String model = "AppleTv gen2";
	static String info;
	static int sum;
	
static {
	info= company + "- "+ model;
	
	int channels =0;
		for(int i =1; i<=10; i++) {
			
			channels +=i;
	} sum = channels;
}

//Work same as Consturctor
}
