package questions;

public class ReverseArrays {
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static int[] reverse(int[] arr) {
		
		int n = arr.length;
		int[] ans = new int[n];
		int j = 0;
		
//		for(int i=n-1; i>=0; i--) {
//			ans[j++] = arr[i];
//		}
		
		int i = n-1;
		while(i >= 0) {
			ans[j++] = arr[i--];
			
		}
		return ans;

	}
	
	public static void reverseInPlace(int[] arr) {
		int i =0;
		int j = arr.length-1;
		while( i < j) {
			swap(arr, i, j);
			i++;
			j--;
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		reverseInPlace(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}

}
