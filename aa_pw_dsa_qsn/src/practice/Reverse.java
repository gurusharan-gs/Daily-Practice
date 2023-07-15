package practice;

public class Reverse {
	
	public static void main(String[] args) {
		
		 int[] arr = {1, 2, 3, 4, 5};
		 
		 for(int i=arr.length-1; i>=0; i--) {
			 System.out.print(arr[i]+" ");
		 }
		 System.out.println();
		 
		 int a = 3;
		 int b = 5;
		 System.out.println("a " +a);
		 System.out.println("b " +b);
		 
		 a = a+b;
		 b = a-b;
		 a = a-b;
		 
		 System.err.println();
		 
		 System.out.println("a " +a);
		 System.out.println("b " +b);
		 
//		 int l = 0;
//		 int r = arr.length-1;
//		 
//		 while(l < r) {
//			 swap(arr, l, r);
//			 l++;
//			 r--;
//		 }
//		 
//		 for(int i=0; i<arr.length; i++) {
//			 System.out.print(arr[i]+" ");
//		 }
//		 System.out.println();
	}

	 static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}

}
