package com.ics.institute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ics.institute.model.student.Student;
import com.ics.institute.service.StudentService;

@RestController
@RequestMapping(value="/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping(value="/view")
	public Student getStudent(@RequestParam("rollNo") Integer rollNo) {
		return studentService.getStudent(rollNo);
	}
	
	@PostMapping(value="/save")
	public String saveStudent(@RequestBody Student student) {
		Student studentEntity=studentService.saveStudent(student);
		return "Saved:"+studentEntity;
	}
}
