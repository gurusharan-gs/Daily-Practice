package com.masai.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer roll;
	private String name;
	private Integer marks;
	private String addr;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Integer roll, String name, Integer marks, String addr) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.addr = addr;
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

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	
}
