package ch08.sec13;

public class SealedExmaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplClass impl = new ImplClass();
		
		InterfaceA ia = impl;
		ia.methodA();
		
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodA();
		ib.methodB();
		
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
