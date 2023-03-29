package com.masai.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Course;
import com.masai.model.Student;
import com.masai.repository.CourseDao;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao couresDao;

	@Override
	public Course addCourse(Course course) {

//		Student students = course.getStudent();
//
//		for (Student student : students) {
//			student.getCourse().add(course);
//		}
//		return couresDao.save(course);
		return null;
	}
}
