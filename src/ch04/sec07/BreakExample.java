package ch04.sec07;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			if(num==6) {
				break;
			}
			System.out.println("한번 더");
		} //end of while
		
		System.out.println("종료");
	}

}
