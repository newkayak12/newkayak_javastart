package sec05.exam08_1_serializable;

import java.io.*;

public class ClassA implements Serializable {
	
	int field1;
	ClassB field2 = new ClassB();
	static int field3;
	transient int field4;
	
}
