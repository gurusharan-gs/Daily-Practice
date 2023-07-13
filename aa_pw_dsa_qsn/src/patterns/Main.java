package patterns;

public class Main {

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
		int max = maxNumber(arr);
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] == max) {
				arr[i] = Integer.MIN_VALUE;
			}
		}
		int res = maxNumber(arr);
		return res;

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int res = secondMaxNumber(arr);
		System.out.println(res);
	}

}
