package ch08.sec10.exam02;

public class Bus implements Vehicle {
	public void run() {
		System.out.println("버스가 달린다.");
	}
	
	public void checkFare() {
		System.out.println("승차요금 확인");
	}
}
