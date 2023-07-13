package pw_questions;

public class PrefixSum {

	public static int[] prefixSum(int[] arr) {

		int n = arr.length;
		int[] ans = new int[n];
		int k = 0;
		ans[0] = arr[0];

		for (int i = 1; i < n; i++) {
			ans[i] = ans[i - 1] + arr[i];
		}
		return ans;
	}

	public static int[] prefixSum2(int[] arr) {

		int n = arr.length;
		
		for (int i = 1; i < n; i++) {
			arr[i] = arr[i - 1] + arr[i];
		}
		return arr;
	}

	
	
	public static void main(String[] args) {

		int[] arr = { 2, 1, 3, 4, 5 };
//		int[] res = prefixSum(arr);
		int[] res = prefixSum2(arr);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
		System.out.println();

	}

}
