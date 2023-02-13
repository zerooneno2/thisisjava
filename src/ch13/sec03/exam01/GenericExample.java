package ch13.sec03.exam01;

public class GenericExample {
	
	public static <T>Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> box1 = boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);
		
		Box<String> box2 = boxing("백일섭");
		String strValue = box2.get();
		System.out.println(strValue);
	}

}
