package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Course;
import com.masai.repo.CourseDao;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	private CourseDao courseDao;
	
	@Override
	public Course addCourse(Course course) {
		Course saveCourse = courseDao.save(course);
		return saveCourse;
	}

}
