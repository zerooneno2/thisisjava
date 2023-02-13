package test;

public class Student {
	String name;
	private int korean;
	private int english;
	private int total;
	
	public Student(String name, int korean, int english) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		
		this.total = korean + english;
	}
	
	public String getName() {
		return name;
	}
	
	public int getTotal() {
		return total;
	}

	
	
		
}
