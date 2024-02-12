package com.ics.institute.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ics.institute.model.course.Course;

@RestController
@RequestMapping("/course")
public class CourseControleller {
	@GetMapping(value="/get")
	public Course getCourse(@RequestParam(name="courseId") Integer courseId) {
		return null;
	}
	
	@GetMapping(value="/getAll")
	public List<Course> getAllCourse(){
		return null;
	}
	@PostMapping(value="/save")
	public String saveCourse(@RequestBody Course course) {
		return null;
	}
}
