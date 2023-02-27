package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Course;
import com.masai.repo.CourseDao;
import com.masai.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@PostMapping("/course/add")
	public ResponseEntity<Course> addCourseH(@RequestBody Course course){
		Course saveCourse = courseService.addCourse(course);
		return new ResponseEntity<Course>(saveCourse, HttpStatus.CREATED);
	}

}
