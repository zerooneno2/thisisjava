package ch14.sec04;

public class ThreadNameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName() + "실행");
		
		for (int i = 0; i < 3; i++) {
			Thread threadA = new Thread() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println(getName()+"실행");
				}
				
			};
			threadA.start();
		}
		
		Thread chatThread = new Thread() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(getName()+"실행");
			}
			
		};
		chatThread.setName("chat-Thread");
		chatThread.start();
	}

}
