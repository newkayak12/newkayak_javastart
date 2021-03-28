package sec04.exam02_localVariable;

public class UsingLocalVariable {
		void method(int arg) {
			int localVar = 40;
		
//			arg = 31;
//			Local variable arg defined in an enclosing scope must be final or effectively final
			
//			localVar =41;
//			Local variable arg defined in an enclosing scope must be final or effectively final
			
				Functional fi  = () -> {
					
					 System.out.println("arg  " + arg );
					 System.out.println("localVar  "+ localVar);
					 
				};
				
				fi.method();
				
		}
}
