package pw_questions;

public class DesandingOrderNumber {

	static void reverce(int[] arr) {
		int i = 0, j = arr.length - 1;
		while (i < j) {
			swap(arr, i, j);
			i++;
			j--;
		}
	}

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

//	1
	public static int[] desandingOrderNumber(int[] arr) {

		int n = arr.length;
		int left = 0, right = n - 1;
		int[] ans = new int[n];
		int k = n - 1;
		while (left <= right) {
			if (Math.abs(arr[left]) > Math.abs(arr[right])) {
				ans[k--] = arr[left] * arr[left];
				left++;
			} else {
				ans[k--] = arr[right] * arr[right];
				right--;
			}
		}
		reverce(ans);
		return ans;
	}

//	2
	public static int[] desandingOrderNumber1(int[] arr) {

		int n = arr.length;
		int[] ans = new int[n];
		int k = 0;
		int left = 0, right = n - 1;
		while (left <= right) {
			if (Math.abs(arr[left]) > Math.abs(arr[right])) {
				ans[k++] = arr[left] * arr[left];
				left++;
			} else {
				ans[k++] = arr[right] * arr[right];
				right--;
			}
		}
		reverce(ans);
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = { -10, 2, 1, -4, 6, -8 };
		int[] res = desandingOrderNumber1(arr);
//		reverce(res);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
		System.out.println();
	}
}
