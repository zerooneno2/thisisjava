package ch07.sec06.package2;
import ch07.sec06.package1.*;
public class D extends A {
	public D() {
		super();// 생략 가능
	}
	
	public void method1() {
		super.field = "value";
		super.method();
		
	}
	
	public void method2() {
//		A a = new A();
//		a.field = "value";
//		a.method();
	}
}
