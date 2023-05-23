package questions;

public class TargetSum {

	public static int targetSum(int[] arr, int target) {

		int n = arr.length;
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] + arr[j] == target) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {2,4,6,7,8,9};
		int target = 10;
		int res = targetSum(arr, target);
		System.out.println(res);
	}
}
