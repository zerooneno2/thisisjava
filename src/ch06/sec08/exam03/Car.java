package ch06.sec08.exam03;

public class Car {
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없어");
			return false;
		}
		System.out.println("gas가 있어");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다.(gas잔량: " + gas + ")");
				gas -=1;
			} else {
				System.out.println("멈춥니다.(gas잔량: " + gas + ")");
				return;
			
			}
		}
	}
	
}
