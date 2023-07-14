package com.masai.controller;

public class Student {
	
	private Integer roll;
	private String name;
	private String city;
	private Integer marks;
	
	
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getMarks() {
		return marks;
	}
	
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	
	public Student(Integer roll, String name, String city, Integer marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
