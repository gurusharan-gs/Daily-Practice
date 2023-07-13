package pw_questions;

public class Demo {

	public static void reverce(int[] arr, int i, int j) {
		while (i < j) {
			swap(arr, i, j);
			i++;
			j--;
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void rotetaArrayInPlace(int[] arr, int k) {
		int n = arr.length;
		k = k % n;
		reverce(arr, 0, n - k - 1);
		reverce(arr, n - k, n - 1);
		reverce(arr, 0, n - 1);
	}

	public static void swapZerosOnce(int[] arr) {
		int n = arr.length;
		int left = 0, right = n - 1;

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

	public static void swapEvensOdds(int[] arr) {
		int n = arr.length;
		int left = 0, right = n - 1;

		while (left < right) {
			if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
				swap(arr, left, right);
				left++;
				right--;
			}
			if (arr[left] % 2 == 0) {
				left++;
			}
			if (arr[right] % 2 == 1) {
				right--;
			}
		}
	}

	public static void main(String[] args) {

//		int[] arr = {1,2,3,4,5,6}; // ans = 4,5,6,1,2,3
//		int k = 3;
//		rotetaArrayInPlace(arr, k);

//		int[] arr = { 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0 };
//		swapZerosOnce(arr);

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		swapEvensOdds(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
