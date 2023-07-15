package practice;

public class MaxNumberInArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,12,5,8,7,65,15};
		if (arr.length == 0) {
			throw new IllegalArgumentException("Array is Empty");
		}
		int max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
