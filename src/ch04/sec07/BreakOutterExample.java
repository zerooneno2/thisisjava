package ch04.sec07;

public class BreakOutterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outter: for(char upper = 'A'; upper<='Z'; upper++) {
					for(char lower = 'a'; lower<='z'; lower++) {
						System.out.println(upper + "-" + lower);
						if(lower == 'g') {
							break Outter;
//							break;
						}
						System.out.println("lower 실행중");
					} //end of lower
					
					
					System.out.println("Outter 실행중");
		}// end of outter
		
		System.out.println("종료");
	}

}
