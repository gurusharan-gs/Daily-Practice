package com.example;

public class Demo {
	
	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(10);
		student.setName("sagar");
		student.setAddress("kalaburagi");
		student.setMarks(888);
		
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getAddress());
		System.out.println(student.getMarks());
		
		System.out.println("=============================");
		
		Student student2 = new Student(11, "ravi", 889, "bangalore");
		System.out.println(student2.getId());
		System.out.println(student2.getName());
		System.out.println(student2.getAddress());
		System.out.println(student2.getMarks());
		
		System.out.println("=============================");
		
		Student student3 = new Student(12, "gaurav", 980, "pune");
		System.out.println(student3.getId());
		System.out.println(student3.getName());
		System.out.println(student3.getAddress());
		System.out.println(student3.getMarks());
		
	}

}
