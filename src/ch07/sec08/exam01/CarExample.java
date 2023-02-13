package ch07.sec08.exam01;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		myCar.tire = new Tire(); //Tire 장착
		myCar.run();
		
		myCar.tire = new HankookTire();
		myCar.run();
		
		myCar.tire = new KumhoTire();
		myCar.run();
	}

}
