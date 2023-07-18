package pw_questions;

import java.util.Arrays;

public class RotateArray {
	
	public static void reverceArray(int[] arr, int start, int end) { 
//		int start = 0, end = arr.length-1;
		while(start < end) {
           swap(arr, start, end);
			start++;
			end--;
		}
	}
	
  static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		
	}

	public static void rotateArray(int[] arr, int k) {
		int n = arr.length;
		
		reverceArray(arr, 0, n-k-1);
		reverceArray(arr, n-k, n-1);
		reverceArray(arr, 0, n-1);
	}
	
	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5}; // 5 1 2 3 4
		int k = 5;
		rotateArray(arr, k);
		System.out.println(Arrays.toString(arr));
	
		
	}

}
