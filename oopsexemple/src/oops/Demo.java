package oops;

import java.util.Scanner;

public class Demo {

	void fun1(Student[] students) {

		for (Student student : students) {
			System.out.println("Roll is " + student.getRoll());
			System.out.println("Name is " + student.getName());
			System.out.println("City is " + student.getCity());

			System.out.println("=============================");
		}
	}

	public static void main(String[] args) {

		Student s1 = new Student();

		Demo d1 = new Demo();

//		Employee emp1 = new Employee();
//		emp1.empId = 10;
//		emp1.empName = "ravi";
//		emp1.salary = 7000;

//		emp1.address.state = "karantaka";
//		emp1.address.city = "bangalore";
//		emp1.address.pincode = "500234";

//		System.out.println(emp1.address);

		Scanner sc = new Scanner(System.in);

		System.out.println("How many Student ?");
		int num = sc.nextInt();

		Student[] student = new Student[num];

		for (int i = 0; i < student.length; i++) {

			System.out.println("Enter Details of Student " + (i + 1));

			System.out.println("enter roll ");
			int roll = sc.nextInt();

			System.out.println("enter name ");
			String name = sc.next();

			System.out.println("enter city ");
			String city = sc.next();

			student[i] = new Student(roll, name, city);
		}

		d1.fun1(student);

	}

}
