package com.masai.model;

import java.util.ArrayList;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.List;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer roll;
	private String name;
	private Integer marks;
	
	@ElementCollection
	@Embedded
	private List<Address> addresses = new ArrayList<>();

	public Employee(Integer roll, String name, Integer marks, java.util.List<Address> addresses) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.addresses = addresses;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getRoll() {
		return roll;
	}

	public void setRoll(Integer roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	public java.util.List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(java.util.List<Address> addresses) {
		this.addresses = addresses;
	}

	
	@Override
	public String toString() {
		return "Employee [roll=" + roll + ", name=" + name + ", marks=" + marks + ", addresses=" + addresses + "]";
	}
	
	

}
