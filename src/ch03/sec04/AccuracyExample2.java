package ch03.sec04;

public class AccuracyExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int apple = 1;
		int totalPiece = apple*10;
		int number = 7;
		
		int result = totalPiece - number;
		System.out.println("10조각에서 남은 양: " +result);
		System.out.println("사과1개에서 남은 양: " + result/10.0);
	}

}
