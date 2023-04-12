package day5java;

import java.util.Random;

public class B {

	public static void main(String[] args) {
		
	      // Set the divisor value
        int divisor = 5;

        // Generate two random numbers between 1 and 1000
        Random random = new Random();
        int x = random.nextInt(1000) + 1;
        int y = random.nextInt(1000) + 1;

        // Initialize count to 0
        int count = 0;

        // Check if both x and y are divisible by the divisor
        if (x % divisor == 0 && y % divisor == 0) {
            count++;
        }

        // Print x, y, and the count
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("Count: " + count);
		
	}
}
