package practice;

public class P1 {
	
	static void findX(int[] arr, int x) {
		int n = arr.length;
		
		for(int i=0; i<n; i++) {
			for(int j = i+1; j<n; j++) {
				if(arr[i]+arr[j] == x) {
					System.out.println(arr[j]);
				}
			}
		}

	}
	
	public static void main(String[] args) {
	
		int[] arr = {1,2,3,4,5};
		int x = 5;
		findX(arr, x);
		
	}

}
