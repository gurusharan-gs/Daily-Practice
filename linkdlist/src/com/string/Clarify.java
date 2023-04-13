package com.string;

public class Clarify {

	public static void main(String[] args) {

//		int x = 10;
//		int y = 15;
//		int count = 0;
//		for (int i = 1; i < Math.min(x, y); i++) {
//			if (x % i == 0 && y % i == 0) {
//				count++;
//			}
//		}
//		System.out.println(count);

		System.out.println("===============================");

		int[] arr = { 4, 2, 1, 10, 6 };
		int n = arr.length;

		int pSum = 1;
		for (int i = 0; i < n; i++) {
			pSum *= arr[i];
		}

		int x = 1;
		while (x*x < pSum) {
			x++;
		}

		System.out.println(x);
	}

}
