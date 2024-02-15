package com.ics.institute.model.student;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.ics.institute.model.course.Course;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	@Id
	private int rollNo;
	@Column(name = "student_name")
	private String studentName;
	@Column(name = "father_name")
	private String fatherName;
	@Column(name = "mother_name")
	private String motherName;
	@Column(name = "student_age")
	private int studentAge;
	
	@OneToMany(mappedBy = "student")
	List<Address> address;
	
	@OneToOne
	@JoinColumn(name = "course_id",insertable = false,updatable = false)
	Course course;
}
