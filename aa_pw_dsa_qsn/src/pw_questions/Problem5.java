package pw_questions;

public class Problem5 {

	public static int[] prefixSumQuestion(int[] arr) {
		int n = arr.length;
		int[] ans = new int[n];
		ans[0] = arr[0];

		for (int i = 1; i < n; i++) {
			ans[i] = ans[i - 1] + arr[i];
		}
		return ans;
	}

	public static int[] prefixSumQuestion2(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			arr[i] = arr[i - 1] + arr[i];
		}
		return arr;
	}

	public static void swap(int[] arr, int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}

	public static void swapZeroAndOne(int[] arr) {

		int n = arr.length, left = 0, right = n - 1;
		while (left < right) {
			if (arr[left] == 1 && arr[right] == 0) {
				swap(arr, left, right);
				left++;
				right--;
			}
			if (arr[left] == 0) {
				left++;
			}
			if (arr[right] == 1) {
				right--;
			}
		}
	}

	public static void main(String[] args) {

//		int[] arr = { 2, 1, 3, 4, 5 };
		int[] arr = { 1,0,1,0,0,1,0,1,0,0,1,0};
		swapZeroAndOne(arr);
//		int[] res = prefixSumQuestion(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
