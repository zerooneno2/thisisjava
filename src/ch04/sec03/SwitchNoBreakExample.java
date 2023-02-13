package ch04.sec03;

public class SwitchNoBreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = (int)(Math.random()*4)+8;
//		time = 8;
		System.out.println("[현재 시간: " +time+ "시]");
		
		switch(time) {
			case 8:
				System.out.println("출근");
//				break;
			case 9:
				System.out.println("회의");
//				break;
			case 10:
				System.out.println("업무");
//				break;
			default:
				System.out.println("퇴근");
		}
	}

}
