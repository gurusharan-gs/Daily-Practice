package practice;

public class FindTheSecondLargestElementArray {

	static int maxNumber(int[] arr) {
		int n = arr.length;

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	static int secondMaxNumber(int[] arr) {
		int max = maxNumber(arr);
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (max == arr[i]) {
				arr[i] = Integer.MIN_VALUE;
			}
		}
		int res = maxNumber(arr);
		return res;
	}

	public static void main(String[] args) {

		int[] arr = {3, 1, 4, 4, 5};
		System.out.println(secondMaxNumber(arr));
		;
	}

}
