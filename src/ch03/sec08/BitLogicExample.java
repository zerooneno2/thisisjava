package ch03.sec08;

public class BitLogicExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("70&35 = " + (70&35));
		System.out.println("70|17 = " + (70|17));
		System.out.println("34^63 = " + (34^63));
		System.out.println("~45 = " + (~45));
		System.out.println("---------------------------");
		
		byte receiveData = -128;
		
		int unsignedInt1 = receiveData&255;
		System.out.println(unsignedInt1);
		
		int unsignedInt2 = Byte.toUnsignedInt(receiveData);
		System.out.println(receiveData);
		
		int test = 136;
		byte btest = (byte)test;
		System.out.println(btest);
	}

}
