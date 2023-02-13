package ch09.sec06.exam02;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button ok = new Button();
		
		class OkListner implements Button.ClickListner{

			@Override
			public void onClick() {
				System.out.println("OK 버튼 클릭");
			}
			
		}// end of OkListner
		
		ok.setClickLister(new OkListner());
		ok.click();
		
		//------------------------
		
		
		
		Button cancel = new Button();
		
		class CancelListner implements Button.ClickListner{

			@Override
			public void onClick() {
				System.out.println("Cancel 클릭");
			}// 
			
		}//end of Cancel
		
		cancel.setClickLister(new CancelListner());
		cancel.click();
		
		//-------------------------------
		
		Button nope = new Button();
		class NopeListner implements Button.ClickListner{

			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("싫어");
			}
			
		}// end of NopeListner
		
		nope.setClickLister(new NopeListner());
		nope.click();
		
		Button C = new Button();
		class cListner implements Button.ClickListner{

			@Override
			public void onClick() {
				System.out.println("c 배워");
			}
			
			
		}
		
		C.setClickLister(new cListner());
		C.click();
	}

}
