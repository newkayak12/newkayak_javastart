package file.addon.Serializable;

import java.io.Serializable;

public class ClassB implements Serializable{
	int field1;

	public int getField1() {
		return this.field1;
	}

	public void setField1(int field1) {
		this.field1 = field1;
	}

	@Override
	public String toString() {
		return "{" +
			" field1='" + getField1() + "'" +
			"}";
	}

}
