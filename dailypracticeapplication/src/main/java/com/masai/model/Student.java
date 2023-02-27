package com.masai.model;

public class Student {
	
	private Integer id;
	private String name;
	private Integer marks;
	
	private Address addr;

	public Student(Integer id, String name, Integer marks, Address addr) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.addr = addr;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	

}
