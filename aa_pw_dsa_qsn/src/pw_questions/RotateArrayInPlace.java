package pw_questions;

public class RotateArrayInPlace {
	static void reverce(int[] arr, int i, int j) {
		while(i < j) {
			swap(arr, i, j);
			i++;
			j--;
		}
	}
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	public static void rotateArrayInPlace(int[] arr, int k) {
		int n = arr.length;
		k = k % n;
		reverce(arr, 0, n-k-1);
		reverce(arr, n-k, n-1);
		reverce(arr, 0, n-1);
		
	}
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int k = 3;
		
	    rotateArrayInPlace(arr, k);
	   
	   for(int i=0; i<arr.length; i++) {
		   System.out.print(arr[i]+" ");
	   }
	   System.out.println();
	}
}
