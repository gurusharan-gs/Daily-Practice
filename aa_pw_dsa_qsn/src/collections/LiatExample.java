package collections;

import java.util.ArrayList;
import java.util.List;

public class LiatExample {

	static void arrayListExample() {

		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(15);
		l.add(52);
		l.add(22);
		l.add(32);
		
//		System.out.println(l);
		
		l.add(4, 4);
		l.add(5, 18);
		
//		System.out.println(l);
		
//		l.clear();
//		System.out.println(l);
		
//		System.out.println(l.contains(52)); // true
//		System.out.println(l.contains(60)); // false
		
//		System.out.println(l.get(5));
//		System.out.println(l);
//		l.remove(1);
//		System.out.println(l);
		
//		System.out.println(l.size());
		
		System.out.println(l.toString());
		
//		System.out.println(l);
		
//		for(int i=0; i<l.size(); i++) {
//			System.out.println(l.get(i));
//		}
		
//		for(Integer i : l) {
//			System.out.println(i);
//		}
		
//		for(var i : l) {
//			System.out.println(i);
//		}
		
//		l.forEach((i) -> System.out.println(i));
		
//		l.stream().forEach(s -> System.out.println(s));
		
		

	}

	public static void main(String[] args) {

		arrayListExample();
	}

}
