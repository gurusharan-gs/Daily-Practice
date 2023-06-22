package pw_questions;

public class swapOddAndEven {

	public static void swapOddAndEvenH(int[] arr) {
		int n = arr.length;
		int left = 0;
		int right = n - 1;

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
	static void swap(int[] arr, int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6,7};
		swapOddAndEvenH(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
