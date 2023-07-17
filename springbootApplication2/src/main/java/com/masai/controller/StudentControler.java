package com.masai.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Student;

import jakarta.annotation.PostConstruct;

@RestController
public class StudentControler {

	private List<Student> students = new ArrayList<>();

	@PostConstruct
	public void setupStudents() {

		students.add(new Student(10, "sagar", "bangalore", 845));
		students.add(new Student(12, "umesh", "pune", 945));
		students.add(new Student(13, "ravi", "mumbhai", 755));
		students.add(new Student(14, "ajay", "dheli", 885));
		students.add(new Student(15, "naveen", "channei", 895));

	}

	@GetMapping("/student")
	public List<Student> getAllStudentsHandler() {
		return students;
	}

	@PostMapping("/student")
	public Student registerStudent(@RequestBody Student student) {
		students.add(student);
		return student;
	}

	@GetMapping("/student/{roll}")
	public Student getStudentHendler(@PathVariable("roll") Integer roll) {

		Student s = null;
		for (Student student : students) {
			if (student.getRoll() == roll) {
				s = student;
			}

		}
		if (s != null) {
			return s;
		} else {
			throw new IllegalArgumentException("Student does not exist with Roll :" + roll);
		}
	}
	
	@DeleteMapping("/student/{roll}")
	public String deleteStudentForList(@PathVariable("roll") Integer roll) {
		boolean flag = true;
		for(int i=0; i<students.size(); i++) {
			if (students.get(i).getRoll()==roll) {
				students.remove(i);
				flag = false;
				break;
			}
		}
		if (!flag) {
			return "Student Deleted Sucessfully..";	
		}
		throw new IllegalArgumentException("Student does not exist with Roll :" + roll);
	}
	
	@PutMapping("/student/{roll}")
	public Student updateStudentDetails(@RequestBody Student student, @PathVariable("roll") Integer roll) {
		boolean flag = true;
		
		for(int i=0; i<students.size(); i++) {
			if (students.get(i).getRoll()==roll) {
				Student existingStudent = students.get(i);
				
				existingStudent.setName(student.getName()) ;
				existingStudent.setAddress(student.getAddress());
				existingStudent.setMarks(student.getMarks());
				
				flag = false;
				
				return existingStudent;
			}

		}
		if (flag)
			throw new IllegalArgumentException("Student does not exist with Roll :" + roll);
		return null;
	}
}
