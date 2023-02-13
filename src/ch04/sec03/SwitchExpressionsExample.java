package ch04.sec03;

public class SwitchExpressionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'a';
		
		switch(grade) {
			case 'A','a'->{
				System.out.println("우수 회원입니다.");
			}
			case 'B','b'->{
				System.out.println("일반 회원입니다.");
			}
			default->{
				System.out.println("손님 입니다.");
			}
		} // end of switch
		
		switch(grade) {
			case 'A','a' -> System.out.println("우수 회원입니다.");
			case 'B','b' -> System.out.println("일반 회원입니다.");
			default -> System.out.println("손님 입니다.");
		}
	}

}
