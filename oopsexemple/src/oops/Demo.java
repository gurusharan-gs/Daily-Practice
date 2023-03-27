package oops;

public class Demo {
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
//		s1.show();
		
		Employee emp1 = new Employee();
		emp1.empId = 10;
		emp1.empName = "ravi";
		emp1.salary = 7000;
		
//		emp1.address.state = "karantaka";
		emp1.address.city = "bangalore";
		emp1.address.pincode = "500234";
		
		System.out.println(emp1.address);
		
		
		
	}

}
