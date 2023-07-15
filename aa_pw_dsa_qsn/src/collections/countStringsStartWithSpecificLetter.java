package collections;

import java.util.ArrayList;

public class countStringsStartWithSpecificLetter {
	
	public static void main(String[] args) {
		
		ArrayList<String> nameList = new ArrayList<>();
		nameList.add("Mango");
		nameList.add("Apple");
		nameList.add("Banana");
		nameList.add("Orange");
		nameList.add("Apple");
		nameList.add("Banana");
		nameList.add("Orange");
		nameList.add("Avocado");
		nameList.add("Apricot");
		
		long count = nameList.stream().filter(s -> s.startsWith(String.valueOf("A"))).count();
		System.out.println(count);
	}

}
