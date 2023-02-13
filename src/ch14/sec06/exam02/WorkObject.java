package ch14.sec06.exam02;

public class WorkObject {
	public synchronized void methodA() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": methodA실행");
		notify();
		
		try {
			wait();
		} catch(Exception e) {
			
		}
		
	}
	
	public synchronized void methodB() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": methodB실행");
		notify();
		
		try {
			wait();
		} catch(Exception e) {
			
		}
	}
}
