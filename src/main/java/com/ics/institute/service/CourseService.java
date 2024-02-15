package com.ics.institute.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ics.institute.model.course.Course;
import com.ics.institute.model.dto.CourseDTO;

@Service
public interface CourseService {
	public Course getCourse(Integer courseId);
	public List<Course> getCourses();
	public CourseDTO saveCourse(Course course);
	public String saveCourses(List<Course> courses);
}
