package oops;

public class Student {
	
	int roll;
	String name;
	String city;
	

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.roll = 10;
		s1.name = "agar";
		s1.city = "bangalore";
		
		System.out.println(s1.roll);
		System.out.println(s1.name);
		System.out.println(s1.city);
		
	}
}
