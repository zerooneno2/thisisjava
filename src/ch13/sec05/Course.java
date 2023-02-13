package ch13.sec05;

public class Course {
	
	public static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + " 이(가) course1 등록");
	}
	
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + " 이(가) course2 등록");
	}
	
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + " 이(가) course3 등록");
	}
}
