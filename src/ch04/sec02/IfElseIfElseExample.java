package ch04.sec02;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 85;
		
		if(score>=90) {
			System.out.println("90점 이상입니다.");
			System.out.println("A등급");
		}
		else if(score>=80) {
			System.out.println("80점 이상입니다.");
			System.out.println("B등급");
		}
		else if(score>=70) {
			System.out.println("70점 이상입니다.");
			System.out.println("C등급");
		}
		else {
			System.out.println("70점 미만입니다.");
			System.out.println("D등급");
		}
	}

}
