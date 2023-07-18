package pw_questions;

public class RepetedNumber {
	
	public static void main(String[] args) {
		
		int[] arr = {  2, 3, 4, 3, 2, 1};
		int n = arr.length;
		int rept = -1;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i] == arr[j]) {
					rept = arr[i];
//					return;
				}
			}
		}
		System.out.println(rept);
	}

}
