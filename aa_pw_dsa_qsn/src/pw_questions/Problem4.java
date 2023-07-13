package pw_questions;

public class Problem4 {
	
	public static int[] squearoot(int[] arr) {
		int n = arr.length;
		int left = 0, right = n - 1;
		int[] ans = new int[n];
		int k = 0;
		
		while(left <= right) {
			if(Math.abs(arr[left]) > Math.abs(arr[right])) {
				ans[k++] = arr[left] * arr[left];
				left++;
			}else {
				ans[k++] = arr[right] * arr[right];
				right--;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		
	    int[] arr = {-10,-20,1,0,5,8,-2,-9};
	    int[] res = squearoot(arr);
	    for(int i=0; i<res.length; i++) {
	    	System.out.print(res[i]+" ");
	    }
	    System.out.println();
	}

}
