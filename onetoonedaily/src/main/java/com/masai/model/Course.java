package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Course {

	@Id
	private Integer id;
	private String courseName;
	
	
	
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Course(Integer id, String courseName) {
		super();
		this.id = id;
		this.courseName = courseName;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	

	
	
	

}

