package com.ics.institute.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ics.institute.mapper.CourseObjectMapper;
import com.ics.institute.model.course.Course;
import com.ics.institute.model.dto.CourseDTO;
import com.ics.institute.repository.CourseRepo;
import com.ics.institute.service.CourseService;

@Component
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseRepo courseRepo;
	
	@Autowired
	CourseObjectMapper mapper;

	@Override
	public Course getCourse(Integer courseId) {
		return null;
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CourseDTO saveCourse(Course course) {
		Course entity=courseRepo.save(course);
		return mapper.mapCourseEntityToCourseDTO(entity);
	}

	@Override
	public String saveCourses(List<Course> courses) {
		courseRepo.saveAll(courses);
		return null;
	}

}
