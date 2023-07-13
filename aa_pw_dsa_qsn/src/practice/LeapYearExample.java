package practice;

public class LeapYearExample {
	
	public static void main(String[] args) {
		int year = 2024;
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("The year is a leap year.");
		} else {
            System.out.println("The year is not a leap year.");
        }
	}

}
