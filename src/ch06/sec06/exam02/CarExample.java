package ch06.sec06.exam02;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		System.out.println("제작회사: "+ myCar.company);
		System.out.println("모델: "+ myCar.model);
		System.out.println("색상: "+ myCar.color);
		System.out.println("최고속도: "+ myCar.maxSpeed);
		System.out.println("속도: "+ myCar.speed);
		
		myCar.speed = 60;
		System.out.println("수정속도: " + myCar.speed);
	} 

}
