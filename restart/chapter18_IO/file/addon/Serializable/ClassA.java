package file.addon.Serializable;

import java.io.Serializable;

public class ClassA implements Serializable{
	int field1;
	ClassB field2 = new ClassB();
	static int field3; //직렬화 제외
	transient int field4; //직렬화 제외


	public int getField1() {
		return this.field1;
	}

	public void setField1(int field1) {
		this.field1 = field1;
	}

	public ClassB getField2() {
		return this.field2;
	}

	public void setField2(ClassB field2) {
		this.field2 = field2;
	}


	@Override
	public String toString() {
		return "{" +
			" field1='" + getField1() + "'" +
			", field2='" + getField2() + "'" +
			"}";
	}

	
}
