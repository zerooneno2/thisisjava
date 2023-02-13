package ch08.sec12;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("버스 달려");
	}
	public void checkPare() {
		System.out.println("요금 확인");
	}
	
}
