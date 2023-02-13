package ch04.sec06;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메시지를 입력");
		System.out.println("q를 입력하면 종료");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while(!inputString.equals("q"));
		
		System.out.println();
		System.out.println("종료");
	}

}
