package ch14.sec07.exam03;


public class InterruptExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = (Thread) new PrintThread();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			
		}
		thread.interrupt();
	}
	}


