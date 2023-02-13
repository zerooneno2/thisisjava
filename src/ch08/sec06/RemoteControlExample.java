package ch08.sec06;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc;
		rc = new Television();
		
		rc.turnOn();
		rc.setVolume(15);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		
		System.out.println();
		
		rc = new Audio();
		rc.setVolume(7);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		
		RemoteControl.changeBattery();
	}

}
