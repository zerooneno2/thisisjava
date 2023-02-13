package ch05.sec05;

public class LengthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sos = 9506241230123L;
		String ssn = String.valueOf(sos);
		int length = ssn.length();
		if(length == 13) {
			System.out.println("자릿수가 맞습니다.");
		} else {
			System.out.println("자릿수가 틀립니다.");
		}
	}

}
