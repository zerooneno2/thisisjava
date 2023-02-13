package ch12.sec12;

import java.lang.annotation.ElementType;
import java.lang.annotation.*;


@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)

public @interface PrintAnnotation {
	String value() default "-";
	int number()default 15;
	
}
