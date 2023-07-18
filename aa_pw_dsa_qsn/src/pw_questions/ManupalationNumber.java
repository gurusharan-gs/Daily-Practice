package pw_questions;

public class ManupalationNumber {
	
	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 3, 2, 1};
		int n = arr.length;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i] == arr[j]) {
					arr[i] = -1;
					arr[j] = -1;
				}
			}
		
		}
		for(int i = 0; i<n; i++) {
			if(arr[i] > 0) {
				System.out.println(arr[i]);
			}
		}
	}

}
