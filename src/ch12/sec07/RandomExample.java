package ch12.sec07;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] selectNum = new int[6];
		Random random = new Random(3);
		
		System.out.print("선택번호: ");
		for (int i = 0; i < selectNum.length; i++) {
			selectNum[i] = random.nextInt(45)+1;
			System.out.print(selectNum[i] + " ");
		}
		System.out.println();
		
		int[] winninNumber = new int[6];
		random = new Random(3);
		for (int i = 0; i < winninNumber.length; i++) {
			winninNumber[i] = random.nextInt(45)+1;
			System.out.print(winninNumber[i] +  " ");
			
		}
		System.out.println();
		
		
		Arrays.sort(selectNum);
		Arrays.sort(winninNumber);
		boolean result = Arrays.equals(selectNum, winninNumber);
		System.out.print("당첨여부: ");
		if(result) {
			System.out.println("1등");
		} else {
			System.out.println("까비");
		}
	}

}
