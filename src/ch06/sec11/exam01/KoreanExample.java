package ch06.sec11.exam01;

public class KoreanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korean k1 = new Korean("123456-1234567", "감자바");
		
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		k1.name ="이자바";
//		k1.nation = "USA";
		System.out.println(k1.name);
	}

}
