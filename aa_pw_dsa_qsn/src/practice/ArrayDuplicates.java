package practice;

import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicates {

	public static int[] removeDuplicates(int[] nums) {
		int n = nums.length;
		Set<Integer> set = new HashSet<>();

//		for (int i = 0; i < n; i++) {
//			set.add(i);
//		}
		for(int num : nums) {
			set.add(num);
		}
		int[] arr = new int[set.size()];
		int i = 0;
		for (int num : set) {
			arr[i] = num;
			i++;
		}
		return arr;
	}

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 2, 4, 3, 4, 5 };
		int[] uniqueArray = removeDuplicates(nums);
		System.out.print("Array after removing duplicates: ");
		for (int num : uniqueArray) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

}
