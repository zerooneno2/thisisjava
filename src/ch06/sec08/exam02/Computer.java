package ch06.sec08.exam02;

public class Computer {
	int sum (int ... value) {
		int sum = 0;
		
		
		for(int i = 0; i<value.length; i++) {
			sum+=value[i];
		}
		
		return sum;
	}
	
	
}
