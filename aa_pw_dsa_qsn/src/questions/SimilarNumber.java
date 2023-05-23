package questions;

public class SimilarNumber {
	
	public static int similarNumberFinding(int[] arr) {
		int n = arr.length;
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i]==arr[j]) {
					return arr[i];
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,5,4,};
		System.out.println(similarNumberFinding(arr));
	}


}
