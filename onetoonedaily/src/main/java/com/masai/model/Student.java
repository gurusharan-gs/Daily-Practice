package com.masai.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;



@Entity
public class Student {
	
	@Id
	@Column(name = "student_id")
	private Integer id;
	private String name;
	
	@OneToOne
	private Course course;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;

	}

	

	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
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


}
