package ch06.sec08.exam04;

public class CalculatorExmaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCal = new Calculator();
		
		double result1 = myCal.areaRectangle(10);
		double result2 = myCal.areaRectangle(10, 20);
		
		System.out.println("정사각형 넓이: " +result1);
		System.out.println("직사각형 넓이: " +result2);
		
	}

}
