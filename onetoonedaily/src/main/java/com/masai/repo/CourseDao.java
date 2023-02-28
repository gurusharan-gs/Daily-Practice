package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.Course;

public interface CourseDao extends JpaRepository<Course, Integer>{

}
