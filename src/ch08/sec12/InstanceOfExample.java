package ch08.sec12;

public class InstanceOfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		ride(taxi);
		System.out.println();
		ride(bus);
		
	}
	
	public static void ride(Vehicle vehicle) {
//		if(vehicle instanceof Bus) {
//			Bus bus = (Bus)vehicle;
//			bus.checkPare();
//		}
		
		if(vehicle instanceof Bus bus) {
			bus.checkPare();
		}
		
		vehicle.run();
	} // end of ride

}
