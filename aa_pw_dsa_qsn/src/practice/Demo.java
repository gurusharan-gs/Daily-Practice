package practice;

public class Demo {
	
	
	public static void main(String[] args) {
		int number = 10;
		boolean isPrime = true;
		
        if (number <= 1) {
			isPrime = false;
		}else {
			for(int i = 2; i<=Math.sqrt(number); i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
        if(isPrime) {
        	System.out.println("prime");
        }else {
        	System.out.println("not prime");
        }
	}

}
