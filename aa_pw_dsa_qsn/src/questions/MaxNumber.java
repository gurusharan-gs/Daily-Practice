package questions;

public class MaxNumber {

	public static int maxNumber(int[] arr) {
		int n = arr.length;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int secondMaxNumber(int[] arr) {

		int mx = maxNumber(arr);
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == mx) {
				arr[i] = Integer.MIN_VALUE;
			}
		}
		int secondMax = maxNumber(arr);
		return secondMax;  
	}

	public static void main(String[] args) {
		int[] arr = { 2, 5, 4, 8, 7, 15, 9 };
		System.out.println(secondMaxNumber(arr));
	}
}
