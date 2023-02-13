package ch09.sec07.exam03;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button btnOk = new Button();
		
		btnOk.setClickListner(new Button.ClickListner() {
			
			@Override
			public void onClick() {
				System.out.println("Ok버튼클릭");
			}
		});
		
		btnOk.click();
		
		//---------------------------------------------------
		
		Button btnC = new Button();
		
		btnC.setClickListner(new Button.ClickListner() {
			
			@Override
			public void onClick() {
				System.out.println("Cancel 클릭");
			}
		});
		
		btnC.click();
		//-----------------------------------
		
		Button nope = new Button();
		
		nope.setClickListner(new Button.ClickListner() {
			
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("싫어");
			}
		});
		
		nope.click();
		
		//--------------------------------
		
		Button ohNo = new Button();
		
		ohNo.setClickListner(new Button.ClickListner() {
			
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("집에 가");
			}
		});
		ohNo.click();
	}

}
