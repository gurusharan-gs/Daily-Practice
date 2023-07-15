package practice;

public class factorial {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int n = arr.length;
		
		if (n < 0 || n > 12) {
			throw new IllegalArgumentException("Invalid Value");
		}
		int fact = 1;
		for(int i=n-1; i>=0; i--) {
			fact *= arr[i];
		}
		System.out.println(fact);
	}

}
