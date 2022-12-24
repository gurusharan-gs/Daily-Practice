package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;import com.masai.model.Address;

public class insertEmpUsecase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name");
		String name = sc.next();
		
		System.out.println("Enter marks");
		int marks = sc.nextInt();
		
		System.out.println("Enter state");
		String state = sc.next();
		
		System.out.println("Enter city");
		String city = sc.next();
		
		System.out.println("Enter pincode");
		String pincode = sc.next();
		
		
		EmployeeDao edao = new EmployeeDaoImpl();
		
		edao.insertEmp(name, marks, new Address(state, city, pincode));
		
		
	}
}
