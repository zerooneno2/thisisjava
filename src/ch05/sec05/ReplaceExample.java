package ch05.sec05;

public class ReplaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String oldStr = "자바는 불멸이다. 자바 개고수";
		String newStr = oldStr.replace("자바", "JAVA");
		String realStr = newStr.replace("고수", "GOSU");
		
		System.out.println(oldStr);
		System.out.println(newStr);
		System.out.println(realStr);
	}

}
