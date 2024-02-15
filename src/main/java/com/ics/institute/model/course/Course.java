package com.ics.institute.model.course;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "course_id")
	private int courseId;
	@Column(name = "course_name")
	private String courseName;
	@Column(name = "description")
	private String description;
	@Column(name = "fees")
	private int fees;
	@Column(name = "duration")
	private int duration;
}
