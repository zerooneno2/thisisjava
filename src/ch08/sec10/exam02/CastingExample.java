package ch08.sec10.exam02;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
		Bus bus = (Bus)vehicle;
		bus.run();
		bus.checkFare();
	}

}
