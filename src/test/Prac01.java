package test;

public class Prac01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] student = new Student[4];
		
		student[0] = new Student("홍길동", 60, 75);
		student[1] = new Student("강호동", 70, 80);
		student[2] = new Student("유재석", 80, 55);
		student[3] = new Student("박명수", 90, 100);
		
		for (int i = 0; i < student.length; i++) {
			for (int j = i; j < student.length; j++) {
				if(student[i].getTotal() < student[j].getTotal()) {
					Student tmp = student[i];
					student[i] = student[j];
					student[j] = tmp;
				}
			}//end of for j 
			
			System.out.println(student[i].getName() + student[i].getTotal());
		}//end of for i 
	}

}
