package questions;

public class Swaps {
	
	public static void swap(int a, int b) {
		
		System.out.println("befor swap value");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("after swap value");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
	
	public static void swapWithOutTemp(int a, int b) {
		
		System.out.println("befor swap value");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("after swap value");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
	
	public static void main(String[] args) {
		
		int a = 9;
		int b = 3;
	    swapWithOutTemp(a, b);
	}

}
