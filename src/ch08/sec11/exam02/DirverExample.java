package ch08.sec11.exam02;

public class DirverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		
//		Bus bus = new Bus();
//		Taxi taxi = new Taxi();
		
		driver.drive(new Taxi());
		driver.drive(new Bus());
	}

}
