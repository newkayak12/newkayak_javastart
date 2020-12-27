package sec12.exam03_import.mycompany;

	import sec12.exam03_import.hankook.*;
// changed the eclipse setting (-java-code style-organize import-Number of imports~~ :1


//	import sec12.exam03_import.hankook.Snowtire;
// cmd+shift+O = Organize import

//import sec12.exam03_import.hyundai.Engine;  //upper package.lower package.~.class name;
//import sec12.exam03_import.hyundai.Break;
//~Break + ~Engine is
// .*(all classes)

	import sec12.exam03_import.hyundai.*;
	import sec12.exam03_import.kumho.*;

//	import sec12.exam03_import.hankook.Tire;
//Same class name problem, Unless you declare the pacakge.*, ~.tire will be created with new import syntax
	
	
	
	
public class Car {
		Engine engine = new Engine();
		Break brk = new Break();
		Snowtire snwtr = new Snowtire();
		BigWidthTire bgwdtr = new BigWidthTire();
		
		
// Same class name, Different package name Problem. If you want to use many same class name,  create constructor with full name about these classes	
		sec12.exam03_import.hankook.Tire tr1=new sec12.exam03_import.hankook.Tire();
		sec12.exam03_import.kumho.Tire tr2 = new sec12.exam03_import.kumho.Tire();
		
}
