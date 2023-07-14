package com.masai.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "hii how are you....";
	}
	
	@RequestMapping("/hi")
	public String sayHi() {
		return "hi.. guru how are you..";
	}

	
	@RequestMapping("/student")
	public Student getStudentHandler() {
		Student student = new Student(10, "guru", "kalburage", 952);
		
		return student;
	}
	
	@RequestMapping("/studentList")
	public List<Student> getStudentHandlerH(){
		List<Student> students = new ArrayList<>();
		students.add(new Student(10, "N1", "bl", 859));
		students.add(new Student(20, "N2", "ab", 959));
		students.add(new Student(30, "N3", "dl", 889));
		students.add(new Student(40, "N4", "mh", 875));
		
		return students;
	}

}
