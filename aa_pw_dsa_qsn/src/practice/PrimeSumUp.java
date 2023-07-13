package practice;

public class PrimeSumUp {
	
	static void sum(int num) {
		int sum = 0;
	for(int i=1; i<=num; i++) {
			if (primeSumUp(i)== true) {
				sum += i;
			}
		}
	System.out.println(sum);
	}
	
	public static boolean primeSumUp(int num) {
		int sum = 0;
		int count = 0;
		for(int i=1; i<=num; i++) {
//			System.out.println(i);
			if(num % i == 0) {
				count++;
			}
		}
//		System.out.println(count)
		if (count == 2) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		int num = 13;
		sum(num);
	}

}
