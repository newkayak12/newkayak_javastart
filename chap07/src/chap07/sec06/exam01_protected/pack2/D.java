package chap07.sec06.exam01_protected.pack2;

import chap07.sec06.exam01_protected.pack1.*;

public class D  extends A{

	public D() {
		super();
		this.field = "value";
		this.method();
		// if inherited, you can use protected one
	}
	public void method() {
		this.field="value";
		this.method();
	}
}
