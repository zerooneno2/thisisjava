package ch09.sec07.exam03;


public class Button {
	public interface ClickListner{
		void onClick();
	}
	
	ClickListner clickListner;

	public void setClickListner(ClickListner clickListner) {
		this.clickListner = clickListner;
	}
	
	public void click() {
		this.clickListner.onClick();
	}
}
