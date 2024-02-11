package com.ics.institute.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ics.institute.model.student.Student;
import com.ics.institute.repository.StudentRepo;
import com.ics.institute.service.StudentService;

@Component
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepo studentRepo;

	@Override
	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public Map<Integer, List<Student>> saveStudents(List<Student> students) {
		Map<Integer, List<Student>> result = new HashMap<>();
		result.put(students.size(), studentRepo.saveAll(students));
		return result;
	}

	@Override
	public Student getStudent(Integer rollNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return null;
	}

}