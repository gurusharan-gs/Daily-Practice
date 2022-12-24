package com.masai.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int roll;
	private String name;
	private int marks;
	
	@Embedded
	private Address addresses;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int roll, String name, int marks, Address addresses) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.addresses = addresses;
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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Address getAddresses() {
		return addresses;
	}

	public void setAddresses(Address addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Employee [roll=" + roll + ", name=" + name + ", marks=" + marks + ", addresses=" + addresses + "]";
	}
	
	

}
