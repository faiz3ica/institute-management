package com.ics.institute.mapper;

import org.springframework.stereotype.Component;

import com.ics.institute.model.course.Course;
import com.ics.institute.model.dto.CourseDTO;

@Component
public class CourseObjectMapper {
	public CourseDTO mapCourseEntityToCourseDTO(Course course) {
		CourseDTO courseDTO = new CourseDTO();
		courseDTO.setCourseId(course.getCourseId());
		courseDTO.setCourseName(course.getCourseName());
		courseDTO.setDescription(course.getDescription());
		courseDTO.setDuration(course.getDuration());
		courseDTO.setFees(course.getFees());
		return courseDTO;
	}

	public Course mapCourseDTOToCourseEntity(CourseDTO courseDTO) {
		Course course = new Course();
		course.setCourseId(courseDTO.getCourseId());
		course.setCourseName(courseDTO.getCourseName());
		course.setDescription(courseDTO.getDescription());
		course.setDuration(courseDTO.getDuration());
		course.setFees(courseDTO.getFees());
		return course;
	}
}
