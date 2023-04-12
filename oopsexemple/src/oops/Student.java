package oops;

public class Student {
	
	private int roll;
	private String name;
	private String city;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int roll, String name, String city) {
		super();
		this.roll = roll;
		this.name = name;
		this.city = city;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", city=" + city + "]";
	}
	
	

//	public static void main(String[] args) {
//		
//		Student s1 = new Student();
//		s1.roll = 10;
//		s1.name = "agar";
//		s1.city = "bangalore";
//		
//		System.out.println(s1.roll);
//		System.out.println(s1.name);
//		System.out.println(s1.city);
//		
//	}
}
