package localMember;

public class UsingLocalVariable {
	void method(int arg){
		int localVar = 40;

		Myfunc fi = ()->{
			System.out.println("arg : "+arg);
			System.out.println("localVar : "+localVar);

			//arg, localVar 모두 final 특성을 가진다. 
		};
		fi.method();
	}
}
