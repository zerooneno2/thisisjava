package ch07.sec08.exam02;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		Vehicle v = new Vehicle();
		
		driver.run(v);
		driver.stop(v);
		
		Bus b = new Bus();
		driver.run(b);
		
		Taxi t = new Taxi();
		driver.run(t);
		
	}

}
