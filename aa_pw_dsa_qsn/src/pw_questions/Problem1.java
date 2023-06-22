package pw_questions;

public class Problem1 {
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void reverceArray(int[] arr) {
		int l= 0;
		int r = arr.length-1;
		
		while(l < r) {
			swap(arr, l, r);
			l++;
			r--;
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,8,7};
		reverceArray(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");	
		}
		System.out.println();
		
		
	}

}
