package ch03.sec07;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int charCode = 'A';
//		int charCode = 'a';
//		int charCode = '5';
		System.out.println(charCode);
		
		if((65<=charCode) & (charCode<=90)) {
			System.out.println("대문자");
		}
		if((97<=charCode) && (charCode<=122)) {
			System.out.println("소문자");
		}
		if((48<=charCode) && (charCode<=57)) {
			System.out.println("0~9숫자");
		}
		
//		int value = 6;
		int value = 7;
		
		if((value%2==0) | (value%3==0)) {
			System.out.println("2 또는 3의 배수");
		}
		boolean result = (value%2==0) || (value%3==0);
		if(!result) {
			System.out.println("2 또는 3의 배수가 아님");
			
		}
		
	}

}
