package recursion;

public class Problem1 {

	public static void increasing(int n) {
		if (n == 1) {
			System.out.println(n);
			return;
		}
		increasing(n - 1);
		System.out.println(n);
	}

	public static void dicreasing(int n) {
		if (n == 1) {
			System.out.print(n);
			return;
		}
		System.out.print(n);
		increasing(n - 1);
	}

	public static void main(String[] args) {
		increasing(4);
		System.out.println();
//		dicreasing(4);
	}

}
