package ch08.sec08;

public class MultiInterfaceImpExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc = new SmartTelevision();
		
		rc.turnOn();
		rc.turnOff();
		
		Searchable sc = new SmartTelevision();
		sc.search("호우");
		
		SmartTelevision st = new SmartTelevision();
		st.turnOn();
		st.turnOff();
		st.search("야");
		
	}

}
