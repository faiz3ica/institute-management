package com.ics.institute.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ics.institute.model.student.Student;

@Service
public interface StudentService {
	public Student saveStudent(Student student);
	public Map<Integer,List<Student>> saveStudents(List<Student> students);
	public Student getStudent(Integer rollNo);
	public List<Student> getStudents();
}
