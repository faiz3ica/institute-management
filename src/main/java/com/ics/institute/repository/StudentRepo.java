package com.ics.institute.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ics.institute.model.student.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
