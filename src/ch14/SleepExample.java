package ch14;

public class SleepExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch(Exception e) {
				System.out.println("안녕...");
			}
		}
		
	}

}
