package questions;

public class AllInOne {

	public static int targetSum(int[] arr, int target) {

		int n = arr.length;
		int count = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i + i; j < n; j++) {
				if (arr[i] + arr[j] == target) {
					count++;
				}
			}
		}
		return count;
	}

	public static int targetSum2(int[] arr, int target) {

		int n = arr.length;
		int count = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i + i; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == target) {
						count++;
					}
				}
			}
		}
		return count;
	}

	public static int findUnique(int[] arr) {

		int n = arr.length;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					arr[i] = -1;
					arr[j] = -1;
				}
			}
		}

		int ans = -1;
		for (int i = 0; i < n; i++) {
			if (arr[i] > 0) {
				ans = arr[i];
			}
		}
		return ans;
	}

	public static int findMx(int[] arr) {
		int n = arr.length;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int findSecondMx(int[] arr) {

		int mx = findMx(arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == mx) {
				arr[i] = Integer.MIN_VALUE;
			}
		}
		int res = findMx(arr);
		return res;
	}

	public static int similarNumber(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					return arr[i];
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
//		int[] arr = { 1,2,3,4,5};
		int[] arr = { 2, 2, 3, 5, 5, 7, 7 };
		int target = 10;
//		System.out.println(targetSum(arr, target));
		System.out.println(targetSum2(arr, target));
//		System.out.println(findUnique(arr));
//		System.out.println(findMx(arr));
//		System.out.println(findSecondMx(arr));
//		System.out.println(similarNumber(arr));

	}
}
