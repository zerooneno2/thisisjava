package ch15.sec04.exam02;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new Hashtable<>();
		
		Thread threadA = new Thread() {

			@Override
			public void run() {
				for(int i = 1; i<=1000; i++) {
					map.put(String.valueOf(i), i);
				}
			}
			
		};
		
		Thread threadB = new Thread() {
			public void run() {
				for(int i = 1001; i<=2000; i++) {
					map.put(String.valueOf(i), i);
				}
			}
		};
		
		threadA.start();
		threadB.start();
		
		try {
			threadA.join();
			threadB.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		int size = map.size();
		System.out.println("엔트리 수: " + size);
		System.out.println();
		
		
	}

}
