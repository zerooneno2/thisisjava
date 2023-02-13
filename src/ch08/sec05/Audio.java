package ch08.sec05;

public class Audio implements RemoteControl {

	private int volume;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Audio켰다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Audio껐다");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("Audio볼륨: " + this.volume);
		
	}
	
	private int memoryVolume;
	
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume = this.volume;
			System.out.println("무음처리할게용");
			setVolume(RemoteControl.MIN_VOLUME);
		} else {
			System.out.println("무음해제에용");
			setVolume(this.memoryVolume);
		}
	}


}
