package sec15.exam01_annotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
// define annotation type

public @interface PrintAnnotation {
	
	String value() default "-";
	//Type :String, Variable name : value , default element
	int number () default 15;
	
}
