package pw_questions;

public class Ex {
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void reverce(int[] arr, int i, int j) {
		while (i < j) {
			swap(arr, i, j);
			i++;
			j--;
		}
	}

	public static void rotateArray(int[] arr, int k) {
		int n = arr.length;
		reverce(arr, 0, n - k - 1);
		reverce(arr, n - k, n - 1);
		reverce(arr, 0, n - 1);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 33;
		rotateArray(arr, k);
		for (var i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

}
