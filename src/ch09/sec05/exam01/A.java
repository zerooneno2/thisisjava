package ch09.sec05.exam01;

public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B{
		void method1() {
			field1 =10;
			method1();
			field2 = 10;
			method2();
		}
	}//end of B
	
	static class C{
		void method() {
			field2 = 10;
			method2();
//			field1 = 5;
//			method1();
		}
	}
}
