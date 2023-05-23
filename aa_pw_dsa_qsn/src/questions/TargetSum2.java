package questions;

public class TargetSum2 {


	public static int TargetSum2(int[] arr, int target) {

		int n = arr.length;
		int count = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int k=j+1; k<n; k++) {
					if(arr[i] + arr[j] + arr[k] == target) {
						 count++;
					}
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] arr = {4,2,3,5,8,9};
		int target = 15;
	    System.out.println(TargetSum2(arr, target));
	}
}
