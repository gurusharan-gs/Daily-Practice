package questions;

public class Demo {
	
	public static int maximumNumber(int[] arr) {
		int n = arr.length;
		int max = Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	public static int secondMaximumNumber(int[] arr) {
		int mx = maximumNumber(arr);
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == mx) {
				arr[i] = Integer.MIN_VALUE;
			}
		}
		int res = maximumNumber(arr);
		return res;
	}
	
	
	public static int uniqueNumber(int[] arr) {
		int n = arr.length;
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i] == arr[j]) {
					arr[i] = -1;
					arr[j] = -1;
				}
			}
		}
		int res = -1;
		for(int i=0; i<n; i++) {
			if(arr[i] > 0) {
				res = arr[i];
			}
		}
		return res;
	}
	
	
	public static void main(String[] args) {
		
//		int[] arr = {2,3,5,8,5,3,2};
		int[] arr = {2,3,5,8,9,10,15};
		System.out.println(uniqueNumber(arr));
		
	}

}
