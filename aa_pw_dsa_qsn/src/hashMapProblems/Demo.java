package hashMapProblems;

import java.util.HashMap;
import java.util.Map;

public class Demo {

	public static void main(String[] args) {
		
		// Syntax of HashMap..
		Map<String, Integer> mp = new HashMap<>();
		
		// Adding Elements..
		mp.put("Gurusharan", 200000);
		mp.put("Anjali", 100000);
		mp.put("Sachin", 25034);
		mp.put("Ravi", 50200);
		mp.put("Arti", 25036);
		
		// Getting value of a key from the HashMap..
		System.out.println(mp.get("Gurusharan")); // 200000
		System.out.println(mp.get("Sharan")); // null
		
		// Changing / Updating value of a key in the hashmap
		mp.put("Arti", 32520);
		System.out.println(mp.get("Arti")); // 32520
		
		// Removeing a pair from the hashmap
		System.out.println(mp.remove("Arti")); // 32520
		System.out.println(mp.remove("Guru")); // null
		
		// Chacking if a key is in the HashMap
		System.out.println(mp.containsKey("Arti")); // false
		System.out.println(mp.containsKey("Anjali")); // true
		
		// Adding a new entry only if the key dosen't exist already
		mp.putIfAbsent("Ramesh", 25689); // will enter
		mp.putIfAbsent("Anjali", 150000); // will not enter
		
		// Get all keys in the HashMap
		System.out.println(mp.keySet());
		
		// Get all value in the HashMap
		System.out.println(mp.values());
		
		// Get all entrys in the hashMap
		System.out.println(mp.entrySet());
		
		// Traversing all entries of HashMap - multiple methods

	}

}
