package ch07.sec09;

public class Student extends Person {
	public int studentNo;
	
	
	public Student(String name, int studnetNo) {
		super(name);
		this.studentNo = studentNo;
		
	}
	
	public void study() {
		System.out.println("공부중");
	}
}
