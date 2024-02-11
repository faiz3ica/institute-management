package com.ics.institute.model.course;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Course {
	@Id
	@Column(name="course_id")
	private int courseId;
	@Column(name="course_name")
	private String courseName;
	@Column(name="description")
	private String description;
	@Column(name="fees")
	private int fees;
	@Column(name="duration")
	private int duration;
}
