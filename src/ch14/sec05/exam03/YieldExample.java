package ch14.sec05.exam03;

public class YieldExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkThread worThreadA = new WorkThread("workThreadA");
		WorkThread worThreadB = new WorkThread("workThreadB");
		
		worThreadA.start();
		worThreadB.start();
		
		try {
			Thread.sleep(5000);
		} catch(Exception e) {
			
		}
		worThreadA.work = false;
		
		
		try {
			Thread.sleep(10000);
		} catch(Exception e) {
			
		}
		worThreadA.work = true;
		
	}

}
