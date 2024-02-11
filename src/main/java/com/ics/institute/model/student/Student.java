package com.ics.institute.model.student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Student {
	@Id
	private int rollNo;
	@Column(name="student_name")
	private String studentName;
	@Column(name="father_name")
	private String fatherName;
	@Column(name="mother_name")
	private String motherName;
	@Column(name="student_age")
	private int studentAge;
}
