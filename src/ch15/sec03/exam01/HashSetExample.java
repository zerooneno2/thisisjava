package ch15.sec03.exam01;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Spring");
		
		int size = set.size();
		System.out.println("객체 수: " + size);
		
	}

}
