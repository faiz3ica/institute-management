package com.ics.institute.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ics.institute.model.student.Address;
import com.ics.institute.model.student.Student;
import com.ics.institute.repository.AddressRepo;
import com.ics.institute.repository.StudentRepo;
import com.ics.institute.service.StudentService;

@Component
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepo studentRepo;

	@Autowired
	AddressRepo addressRepo;

	@Override
	public Student saveStudent(Student student) {
		addressRepo.saveAll(student.getAddress());
		Student result = studentRepo.save(student);
		return result;
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
