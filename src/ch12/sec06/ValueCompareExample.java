package ch12.sec06;

public class ValueCompareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer obj1 = 300;
		Integer obj2 = 300;
		
		System.out.println("==: " + (obj1 == obj2));
		System.out.println("equals(): " + obj1.equals(obj2));
		System.out.println();
		
		
		//-128~127 = true
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==: " + (obj3 == obj4));
		System.out.println("equals(): " + obj3.equals(obj4));
		System.out.println();
		
		int i = 3;
		int j = 3;
		System.out.println(i==j);
	}

}
