package ch04.sec02;

public class IfNestedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = (int)(Math.random()*20) + 81;
		System.out.println("점수: " +score);
		String grade;
		
		if(score>=90) {
			if(score>=95) {
				grade = "A+";
			} else { // score<95
				grade = "A";
			} 
		} //end of if
		else { // score<90
			if(score >=85) {
				grade = "B+";
			} else { // score<85
				grade = "B";
			}
		} //end of else
		
		
		System.out.println("학점: " + grade);
	}

}
