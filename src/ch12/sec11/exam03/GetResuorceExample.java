package ch12.sec11.exam03;

public class GetResuorceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class clazz = Car.class;
		try {
			String photo1Path = clazz.getResource("photo1.jpg").getPath();
			String photo2Path = clazz.getResource("images/photo2.jpg").getPath();
			System.out.println(photo1Path);
			System.out.println(photo2Path);
			
		} catch(Exception e) {
			System.out.println("없소용");
		}
		
	}

}
