package com.ics.institute.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ics.institute.model.course.Course;
@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {

}
