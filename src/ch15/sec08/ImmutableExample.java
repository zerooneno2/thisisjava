package ch15.sec08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> immutableList1 = List.of("A", "B", "C");
//		immutableList1.add("D");
		
		Set<String> immutableSet1 = Set.of("A", "B", "C");
//		immutableSet1.remove("A");
		
		Map<Integer, String> immutableMap1 = Map.of(
				1, "A",
				2, "B",
				3, "C"
				);
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		List<String> immutableList2 = List.copyOf(list);
		
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		Set<String> immutableSet2 = Set.copyOf(set);
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		Map<Integer, String> immutableMap2 = Map.copyOf(map);
		
		String[] arr = {"A", "B", "C"};
		List<String> immutableLisst3 = Arrays.asList(arr);
		
	}

}
