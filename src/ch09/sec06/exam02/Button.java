package ch09.sec06.exam02;

public class Button {
	public static interface ClickListner{
		void onClick();
		
	}
	
	private ClickListner clickListner;
	
	public void setClickLister(ClickListner clickListner) {
		this.clickListner = clickListner;
		
	
	}
	
	public void click() {
		this.clickListner.onClick();
	}
}
