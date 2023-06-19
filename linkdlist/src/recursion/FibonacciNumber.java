package recursion;

import java.util.Scanner;

public class FibonacciNumber {

	public static int fibonacciNumber(int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		return fibonacciNumber(n-1) + fibonacciNumber(n-2);
	}
	
	public static void main(String[] args) {
	 
		System.out.println("Enter the number :-");
		Scanner sc = new Scanner(System.in);
		int ans = sc.nextInt();
		
		for(int i=0; i<ans; i++) {
			System.out.println(fibonacciNumber(i));
		}
		
		
	}
}
