package practice;

public class CheckPrimeNumber {

	public static void checkPrime(int[][] arr) {
		int n = arr.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (checkPrimeNumber(arr[i][j])) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

	public static boolean checkPrimeNumber(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		checkPrime(arr);
	}

}
