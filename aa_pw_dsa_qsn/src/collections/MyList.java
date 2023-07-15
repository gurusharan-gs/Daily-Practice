package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyList {

	public static void main(String[] args) {
		
//	ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("sachin");
		list1.add("shankar");
		list1.add("ramesh");
		list1.add("umesh");
		list1.add("sachin");
		list1.add("riya");
		list1.add("prashant");
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("sachin");
		list2.add("shankar");
		list2.add("ramesh");
		list2.add("umesh");
		
//		System.out.println(list1.get(5));
//		list1.addAll(list2);
		
//		list1.clear();
//		
//		System.out.println(list1.contains("sachin"));
//		System.out.println(list1.contains("guru"));
		
		
//		System.out.println(list1.indexOf("ramesh"));
		
//		System.out.println(list1.lastIndexOf("sachin"));
//	    System.out.println(list1);
//		System.out.println(list1.remove(5));
		
		ArrayList<Integer> number = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
//		number.removeIf(r -> r % 2 == 0);
//		System.out.println(number);
		number.removeIf(r -> r % 2 == 1);
		System.out.println(number);
	
	}
}
