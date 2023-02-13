package test;
import java.util.ArrayList;
import java.util.List;

public class StudentExamprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student[] student = new Student[4];
//		
//		student[0] = new Student("홍길동", 60, 75);
//		student[1] = new Student("강호동", 70, 80);
//		student[2] = new Student("유재석", 80, 55);
//		student[3] = new Student("박명수", 90, 100);
		
		List<Student> student = new ArrayList<>();
		student.add(new Student("홍길동", 60, 75));
		student.add(new Student("강호동", 70, 80));
		student.add(new Student("유재석", 80, 55));
		student.add(new Student("박명수", 90, 100));
		
		
//		for (int i = 0; i < student.length; i++) {
//			for (int j = i; j < student.length; j++) {
//				if(student[i].getTotal < student[j].getTotal()) {
//					Student tmp = student[i];
//					student[i] = stdent[j];
//					student[j] = tmp;
//				}//end of if
//				
//			}//end of for j
//			
//			
//		}//end of for i
		
		
		for (int i = 0; i < student.size(); i++) {
			for (int j = i; j < student.size(); j++) {
				if(student.get(i).getTotal() < student.get(j).getTotal()) {
					Student tmp = student.get(i);
					student.set(i, student.get(j));
					student.set(j, tmp);
				}//end of if
				
			}//end of for j
			
			
		}//end of for i
		
		int order = 1;
		for (int i = 0; i < student.size(); i++) {
			if(i>0) {
				order = student.get(i).getTotal() == student.get(i-1).getTotal()? i : i+1;
				
			}//end of if
			
			System.out.printf("이름: %s 총점: %d 순위: %d\n"
					,student.get(i).getName()
					,student.get(i).getTotal()
					,order);
		} // end of for
		
		
	}

}
