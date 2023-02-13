package ch11.sec02.exam02;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("java.lang.String");
			System.out.println("java.lang.String이 존재합니다.");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		try {
			Class.forName("java.lang.String2");
			System.out.println("java.lang.Strign2가 존재합니다.");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
