package ch07.sec04.exam02;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SupersonicAirplane as = new SupersonicAirplane();
		
		as.takeOff();
		as.fly();
		as.flymode = SupersonicAirplane.SUPERSONIC;
		as.fly();
		as.flymode = SupersonicAirplane.NORMAL;
		as.fly();
		as.land();
	}

}
