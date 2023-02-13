package ch15.sec05.exam03;

import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("백일섭", 21));
		treeSet.add(new Person("김기리", 37));
		
		for(Person person : treeSet) {
			System.out.println(person.name +  ": " + person.age);
		}
	}

}
