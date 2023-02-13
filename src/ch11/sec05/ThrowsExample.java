package ch11.sec05;

public class ThrowsExample {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("예외 처리: " + e.toString());
		}
	}
	
	public static void findClass() throws ClassNotFoundException{
		Class.forName("java.lang String2");
	}

}
