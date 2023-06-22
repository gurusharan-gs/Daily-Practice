package pw_questions;

public class Problem3 {
	
	public static void zerosAndOne(int[] arr) {
		
		int n = arr.length;
		int count = 0;
		for(int i=0; i<n; i++) {
			if(arr[i] == 0) {
				count++;
			}
		}
		
		for(int i=0; i<n; i++) {
			if(i < count) {
				arr[i] = 0;
			}else {
				arr[i] = 1;
			}
		}
	}
	
	static void swapZerosAndOnes(int[] arr){
		
		int n = arr.length;
		
		int left = 0;
		int right = n - 1;
		
		while(left < right) {
			if(arr[left] == 1 && arr[right] == 0) {
				swap(arr, left, right);
				left++;
				right--;
			}
			
			if(arr[left] == 0) {
				left++;
			}
			if(arr[right] == 1) {
				right--;
			}
		}
	}
	
	static void swap(int[] arr, int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}

	public static void main(String[] args) {
		
		int[] arr = {1,1,0,1,0,0,1,0,1,0,1};
		swapZerosAndOnes(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
