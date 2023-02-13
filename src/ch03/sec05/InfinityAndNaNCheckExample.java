package ch03.sec05;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		double y = 0.0;
		double z = x/y;
		
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("계산 불가: " + z);
		} else {
			System.out.println(z);
		}
	}

}
