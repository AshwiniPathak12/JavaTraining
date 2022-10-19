package Question6;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo {
	// This map stores unsorted values
	static Map<String, Integer> map = new HashMap<>();

	public static void sortbyCity() {
		// treemap to store values of hashmap
		TreeMap<String, Integer> sorted = new TreeMap<>();

		// copy all data from hashmap to treemap
		sorted.putAll(map);

		// display treemap in natural order
		for (Map.Entry<String, Integer> entry : sorted.entrySet()) {
			System.out.println("city:-  " + entry.getKey() + "  " + "Population:- " + entry.getValue());
		}

	}

	public static void main(String[] args) {
		map.put("Pune", 10000);
		map.put("Ahmedngar", 20000);
		map.put("Solapur", 30000);
		map.put("Buldhana", 50000);
		map.put("Chandrapur", 40000);

		// Calling the function to sortbyCity
		sortbyCity();
	}

}