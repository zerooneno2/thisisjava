package ch08.sec05;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(3);
		rc.turnOff();
		
		System.out.println();
	
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(3);
		rc.turnOff();
		rc.setMute(true);
		rc.setMute(false);
	}

}
