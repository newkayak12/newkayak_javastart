package localMember;
public class UsingThis {
	public int outterField = 10;

	class Inner{
		int innerField = 20;

		void method(){
			Myfunc fi = ()->{
				System.out.println("outter : "+outterField);
				System.out.println("outter : "+UsingThis.this.outterField);
				System.out.println();

				System.out.println("inner : "+innerField);
				System.out.println("inner : "+this.innerField);
			};

			fi.method();
		}


	}
}
