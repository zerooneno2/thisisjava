package ch05.sec04;

public class GarbageObjectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hobby = "여행";
		System.out.println(hobby);
		hobby = null;
		System.out.println(hobby);
		
		String kind1 = "자동차";
		String kind2 = kind1;
		kind1 = null;
		System.out.println("kind2: " + kind2);
		System.out.println(kind1);
		
	}

}
