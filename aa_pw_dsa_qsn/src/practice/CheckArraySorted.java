package practice;

public class CheckArraySorted {
	
	static boolean checkArraySorted1(int[] arr) {
		int n = arr.length;
		for(int i=0; i<n-1; i++) {
			if (arr[i] > arr[i+1]) {
				return false;
			}
		}
		return true;
	}
	
	static boolean checkArraySorted(int[] arr) {
		int n = arr.length;
		
		for(int i=0; i<n; i++) {
			for(int j = i+1; j<n; j++) {
				if(arr[i] > arr[j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		boolean res = checkArraySorted(arr);
		if(checkArraySorted1(arr)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
