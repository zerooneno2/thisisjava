package ch04.sec04;

public class MultiplicataionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;
		for(int i = 2; i<=9; i++) {
			System.out.println("***" + i + "단 ***");
			for(int j = 1; j<=9; j++) {
				result = i*j;
				System.out.println(i + "x" + j + "= " + result);
			}
		}//end of for
		
		
		
	}

}
