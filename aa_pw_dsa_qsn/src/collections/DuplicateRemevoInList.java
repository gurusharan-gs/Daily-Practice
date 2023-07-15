package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DuplicateRemevoInList {

	public static void main(String[] args) {

//		method 1 using linkedHashSet..
		ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1, 2, 3, 1, 4, 2, 1, 5, 6, 2, 3, 7, 9, 5, 6, 10));
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(numberList);
		ArrayList<Integer> withOutDuplicat = new ArrayList<>(linkedHashSet);
//		System.out.println(withOutDuplicat);

//		method 2 using stream..
		ArrayList<Integer> numberList1 = new ArrayList<>(
				Arrays.asList(1, 2, 3, 1, 4, 2, 1, 5, 6, 2, 3, 7, 9, 5, 6, 10));
		List<Integer> list = numberList1.stream().distinct().collect(Collectors.toList());
//		System.out.println(list);

//		method - 1
		List<String> name = Arrays.asList("guru", "sharan", "ravi", "swath", "anjali", "guru", "anjali", "sagar",
				"sharan");
//		System.out.println(name);
		List<String> nameList = name.stream().distinct().collect(Collectors.toList());
//		System.out.println(nameList);

//		method - 2
		List<String> name2 = Arrays.asList("guru", "sharan", "ravi", "swath", "anjali", "guru", "anjali", "sagar",
				"sharan");
		Set<String> setList = new LinkedHashSet<>(name2);
		List<String> finalList = new ArrayList<>(setList);
//		System.out.println(finalList);

		ArrayList<String> l1 = new ArrayList<>(Arrays.asList("A", "B", "C", "F"));

		ArrayList<String> l2 = new ArrayList<>(Arrays.asList("A", "B", "C", "E"));

		ArrayList<String> l3 = new ArrayList<>(Arrays.asList("B", "A", "C", "E"));

//		1 sort the list and check equals
		Collections.sort(l1);
		Collections.sort(l2);
//		System.out.println(l1.equals(l2)); // false

		Collections.sort(l3);
//		System.out.println(l2.equals(l3)); // true

//		2 comper two list - find out the additional list
		ArrayList<String> l4 = new ArrayList<>(Arrays.asList("A", "B", "C", "F"));
		ArrayList<String> l5 = new ArrayList<>(Arrays.asList("A", "B", "C", "E"));

//		l4.removeAll(l5);
//		System.out.println(l4);
		
//		find mising number
//		l5.removeAll(l4);
//		System.out.println(l5);
		
		ArrayList<String> lang1 = new ArrayList<>(Arrays.asList("JAVA", "Ruby", "C#", "JS"));
		ArrayList<String> lang2 = new ArrayList<>(Arrays.asList("JAVA", "Ruby", "C#", "HTML"));
		lang1.retainAll(lang2);
		System.out.println(lang1);

	}

}
