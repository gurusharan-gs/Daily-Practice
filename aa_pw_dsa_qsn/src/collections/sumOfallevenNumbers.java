package collections;

import java.util.ArrayList;
import java.util.List;

public class sumOfallevenNumbers {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		
//		System.out.println(list);
		
//		sum the even number
		int sumOfLIst = list.stream().filter(number -> number % 2 == 0).mapToInt(Integer::intValue).sum();
		System.out.println(sumOfLIst);
		
//		sum the list
		int sumOfLIst1 = list.stream().mapToInt(i -> i).sum();
		System.out.println(sumOfLIst1);
		
//		sum greater than 4 number
		int sumOfLIst2 = list.stream().filter(f -> f > 4).mapToInt(i -> i).sum();
		System.out.println(sumOfLIst2);
		
//		sum of odd number
		int sumOfLIst3 = list.stream().filter(f -> f % 2 == 1).mapToInt(i -> i).sum();
		System.out.println(sumOfLIst3);
	}
	
	

}
