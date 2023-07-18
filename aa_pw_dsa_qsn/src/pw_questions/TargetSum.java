package pw_questions;

public class TargetSum {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int n = arr.length;
		int target = 10;
		int k = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] + arr[j] == target) {
					k++;
				}
			}
		}
		System.out.println(k);
		
	}

}
