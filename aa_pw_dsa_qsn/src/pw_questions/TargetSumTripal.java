package pw_questions;

public class TargetSumTripal {
	
	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int n = arr.length;
		int target = 10;
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
		System.out.println(count);
	}

}
