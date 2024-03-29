package com.ics.institute.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ics.institute.model.student.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
