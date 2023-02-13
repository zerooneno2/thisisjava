package ch08.sec06;


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
			this.memoryVolume = this.volume; // 현재volume값을 memoryVolume에 저장
			System.out.println("무음처리");
			setVolume(RemoteControl.MIN_VOLUME);
		} else {
			System.out.println("무음해제");
			setVolume(this.memoryVolume);
		}
	}

}
