package practice;

public class PrimeNumberExample {
	
	public static void main(String[] args) {
		
		int number = 10;
		boolean isPrime = true;
		
		if(number <= 1) {
			isPrime = false;
		}else {
			for(int i=2; i<= Math.sqrt(number); i++) {
				if(number % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
        if (isPrime) {
            System.out.println("The number is prime.");
        } else {
            System.out.println("The number is not prime.");
        }
		
	}

}
